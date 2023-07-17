package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import board.Board;
import board.BoardDAO;
import member.Member;
import member.MemberDAO;
import reply.Reply;
import reply.ReplyDAO;

@WebServlet("*.do")  //경로를 .do로 끝나도록 설정
public class MainController extends HttpServlet {
	
	private static final long serialVersionUID = 4L;
	
	MemberDAO memberDAO;  //MemberDAO 객체 선언
	BoardDAO boardDAO;
	ReplyDAO replyDAO;

	public void init(ServletConfig config) throws ServletException {
		memberDAO = new MemberDAO();  //회원 관리 객체 생성
		boardDAO = new BoardDAO();    //게시글 관리 객체 생성
		replyDAO = new ReplyDAO();    //댓글 관리 객체 생성
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 인코딩
		request.setCharacterEncoding("utf-8");
		
		//한글 컨텐츠 유형 응답
		response.setContentType("text/html; charset=utf-8");
		
		//command 패턴으로 url 설정하기
		String uri = request.getRequestURI();
		String command = uri.substring(uri.lastIndexOf('/'));
		
		String nextPage = null;
		
		//출력 스트림 객체 생성
		PrintWriter out = response.getWriter();
		
		//세션 객체 생성
		HttpSession session = request.getSession();
		
		if(command.equals("/index.do")) { //index 페이지 요청
			//게시글 가져오기
			ArrayList<Board> boardList = boardDAO.getBoardList();
			int size = boardList.size(); //게시글의 총수
			//최신글 3개를 담은 배열 생성
			Board[] newBoardList = {boardList.get(size-1), boardList.get(size-2), 
					boardList.get(size-3)};
			
			//모델 생성
			request.setAttribute("boardList", newBoardList);
			
			//index 페이지로 포워딩
			nextPage = "main.jsp";  //main 페이지로 이동
		}else if(command.equals("/memberList.do")) { //회원 목록 조회
			ArrayList<Member> memberList = memberDAO.getMemberList();
			
			//모델 생성 및 보내기
			request.setAttribute("memberList", memberList);
			nextPage = "/member/memberList.jsp";
		}else if(command.equals("/memberForm.do")) {
			nextPage = "/member/memberForm.jsp";
		}else if(command.equals("/addMember.do")) {
			//폼에 입력된 데이터 받기
			String memberId = request.getParameter("memberId");
			String passwd = request.getParameter("passwd1");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			
			Member newMember = new Member();  //회원 객체 생성
			newMember.setMemberId(memberId);
			newMember.setPasswd(passwd);
			newMember.setName(name);
			newMember.setGender(gender);
			
			memberDAO.addMember(newMember); //회원 매개로 DB에 저장
			//가입후 자동 로그인
			session.setAttribute("sessionId", memberId); //세션 발급
			nextPage = "index.jsp";
		}else if(command.equals("/memberView.do")) { //회원 정보 요청
			
			//memberId 받기
			String memberId = request.getParameter("memberId");
			
			Member member = memberDAO.getMember(memberId);
			
			request.setAttribute("member", member);  //member 모델 생성
			
			nextPage = "/member/memberView.jsp";
		} else if(command.equals("/loginForm.do")) { //로그인 페이지 요청
			nextPage = "/member/loginForm.jsp";
		} else if(command.equals("/loginProcess.do")) { //로그인 체크 요청
			//로그인 폼에 입력된 데이터 받아오기
			String memberId = request.getParameter("memberId");
			String passwd = request.getParameter("passwd");
			
			Member loginMember = new Member();
			loginMember.setMemberId(memberId);
			loginMember.setPasswd(passwd);
			
			//로그인 체크 처리
			boolean result = memberDAO.checkLogin(loginMember);
			if(result) {
				//세션 발급 - 아이디에 발급
				session.setAttribute("sessionId", memberId);
				nextPage = "/index.jsp";
			}
			else {
				//2가지 방법 : alert(), errorMsg 보내기(모델)
				out.println("<script>");
				out.println("alert('아이디와 비밀번호를 확인해주세요')");
				out.println("history.go(-1)"); //이전 페이지로 이동
				out.println("</script>");
			}
		} else if(command.equals("/logout.do")) {//로그아웃 요청
			//세션 모두 삭제(해제)
			session.invalidate();
			nextPage = "index.jsp";
		} else if(command.equals("/deleteMember.do")) { //회원 삭제 요청
			String memberId = request.getParameter("memberId");
			memberDAO.deleteMember(memberId); //회원 삭제 처리
			//세션 아웃
			session.invalidate();
			
			nextPage = "/index.jsp";
		} else if(command.equals("/memberEvent.do")) { 
			nextPage = "/member/memberEvent.jsp";
		} else if(command.equals("/memberUpdateForm.do")) { //회원 수정 페이지 요청
			String memberId = request.getParameter("memberId");
			Member member = memberDAO.getMember(memberId);
			String language = request.getParameter("language");
			
			//모델 생성
			request.setAttribute("member", member);
			request.setAttribute("language", language);
			
			//회원 수정 페이지 이동
			nextPage = "member/memberUpdateForm.jsp";
		} else if(command.equals("/updateMember.do")) {
			//회원 수정 폼에 입력된 자료 받기
			String memberId = request.getParameter("memberId");
			String passwd = request.getParameter("passwd1");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			
			//Meber 객체 생성
			Member member = new Member();
			member.setMemberId(memberId);
			member.setPasswd(passwd);
			member.setName(name);
			member.setGender(gender);
			
			//memberDAO의 updateMember()를 호출
			memberDAO.updateMember(member);
		}
		
		//게시판 관리
		if(command.equals("/boardList.do")) {
			//검색 처리
			String _field = request.getParameter("field");
			String _kw = request.getParameter("kw");
			
			String field = "title"; //쿼리값이 전달되지 않을 경우 기본값 사용
			if(_field != null) { //쿼리값이 있는 경우
				field = _field;
			}
			
			String kw = "";  //쿼리값이 전달되지 않을 경우 기본값 사용
			if(_kw != null) { //쿼리값이 있는 경우
				kw = _kw;
			}
			
			//검색 처리 메서드 호출
			//ArrayList<Board> boardList = boardDAO.getBoardList(field, kw);
			
			//페이지 처리
			String pageNum = request.getParameter("pageNum");
			if(pageNum == null) { //pageNum이 없으면 기본 1페이지
				pageNum = "1";
			}
			//각 페이지의 첫행 : 1page->01번, 2page->11, 3->21
			int currentPage = Integer.parseInt(pageNum);
			int pageSize = 10;
			int startRow = (currentPage-1)*pageSize + 1;
			
			//시작 페이지 : 13번->2, 23->3
			int startPage = startRow / pageSize + 1;
			
			//종료(끝) 페이지
			int total = boardDAO.getBoardCount(); //총행수가 나누어 떨어지면 않으면 페이지수에 1을 더함
			//int endPage = toatal / pageSize -> 3page
			int endPage = total / pageSize;  //총행수 / 페이지당 행의 수
			endPage = (total % 10 == 0) ? endPage : endPage + 1;
			
			//게시글 목록보기 함수 호출
			ArrayList<Board> boardList = boardDAO.getBoardList(field, kw, startRow, pageSize);
			
			//모델 생성
			request.setAttribute("boardList", boardList);
			request.setAttribute("currentPage", currentPage);
			request.setAttribute("startPage", startPage);
			request.setAttribute("endPage", endPage);
			request.setAttribute("field", field);
			request.setAttribute("kw", kw);
			
			nextPage = "/board/boardList.jsp";
		}else if(command.equals("/boardForm.do")) {
			nextPage = "/board/boardForm.jsp";
		}else if(command.equals("/addBoard.do")) {
			
			String realFolder = "C:/Users/Administrator/git/jspworks0/Members/src/main/webapp/upload";
			
			MultipartRequest multi = new MultipartRequest(request, realFolder,
					5*1024*1024, "utf-8", new DefaultFileRenamePolicy());
			
			//글쓰기 폼에 입력된 데이터 받아오기(request는 사용하지 않고 multi를 사용함)
			String title = multi.getParameter("title");
			String content = multi.getParameter("content");
			//memberId 세션을 가져오기
			String memberId = (String)session.getAttribute("sessionId");
			
			//fileName 속성 가져오기
			Enumeration<String> files = multi.getFileNames();
			String name = "";
			String fileName = "";
			if(files.hasMoreElements()) {
				name = (String)files.nextElement();
				fileName = multi.getFilesystemName(name); //서버에 저장될 파일이름
			}
			
			Board newBoard = new Board();
			newBoard.setTitle(title);
			newBoard.setContent(content);
			newBoard.setMemberId(memberId);
			newBoard.setFileUpload(fileName);
			
			//글쓰기 처리 메서드 호출
			boardDAO.addBoard(newBoard); //db에 저장
			
		}else if(command.equals("/boardView.do")) {
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			Board board = boardDAO.getBoard(bnum);  //글 상세보기 처리
			
			//댓글 리스트 목록보기 처리
			ArrayList<Reply> replyList = replyDAO.getReplyList(bnum);   
			
			
			//모델 생성
			request.setAttribute("board", board);
			request.setAttribute("replyList", replyList);
			
			nextPage = "/board/boardView.jsp";
		}else if(command.equals("/deleteBoard.do")) {
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			boardDAO.deleteBoard(bnum); //게시글 삭제
			nextPage = "/board/boardList.jsp";  //삭제 후 게시글 목록 이동
		}else if(command.equals("/updateBoard.do")) {
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			Board board = boardDAO.getBoard(bnum); //게시글 상세 보기
			request.setAttribute("board", board);
			nextPage = "/board/updateBoard.jsp";
		}else if(command.equals("/updateProcess.do")) {
			//수정 폼에서 입력 내용 받기
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Board updateBoard = new Board();
			updateBoard.setTitle(title);
			updateBoard.setContent(content);
			updateBoard.setBnum(bnum);
			
			boardDAO.updateBoard(updateBoard); //수정 처리
			nextPage = "/boardList.do";
		}else if(command.equals("/addReply.do")) {
			//댓글 폼에 입력(관련)된 데이터 가져옴
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			String rcontent = request.getParameter("rcontent");
			String replyer = request.getParameter("replyer");
			
			Reply newReply = new Reply();
			newReply.setBnum(bnum);
			newReply.setRcontent(rcontent);
			newReply.setReplyer(replyer);
			
			replyDAO.addReply(newReply);  //댓글 등록 처리
		}else if(command.equals("/deleteReply.do")) { //댓글 삭제
			int rno = Integer.parseInt(request.getParameter("rno"));
			replyDAO.deleteReply(rno);  //삭제 처리
		}else if(command.equals("/replyUpdateForm.do")) { //댓글 수정폼 요청
			//요청한 댓글 불러오기(상세 보기)
			int rno = Integer.parseInt(request.getParameter("rno"));
			Reply reply = replyDAO.getReply(rno);
			//모델 생성
			request.setAttribute("reply", reply);
			//댓글 수정 폼 페이지로 이동
			nextPage = "board/replyUpdateForm.jsp";
		}else if(command.equals("/updateReply.do")) {//댓글 수정 처리
			//폼에 관련한 데이터 받아오기
			int rno = Integer.parseInt(request.getParameter("rno"));
			String rcontent = request.getParameter("rcontent");
			
			//댓글 객체에 저장
			Reply reply = new Reply();
			reply.setRno(rno);
			reply.setRcontent(rcontent);
			
			replyDAO.updateReply(reply);  //댓글 수정 처리
		}
		
		//포워딩 - 새로고침 자동 저장 오류 해결 : response.sendRedirect()
		if(command.equals("/updateMember.do")) { //수정후 회원정보 페이지 이동
			String memberId = request.getParameter("memberId");
			response.sendRedirect("/memberView.do?memberId=" + memberId);
		}else if(command.equals("/addBoard.do")) { //게시글 등록후 게시글 목록으로 이동
			response.sendRedirect("/boardList.do");
		}else if(command.equals("/addReply.do")) {
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			response.sendRedirect("/boardView.do?bnum=" + bnum);
		}else if(command.equals("/deleteReply.do") || command.equals("/updateReply.do")) {
			int bnum = Integer.parseInt(request.getParameter("bnum"));
			response.sendRedirect("/boardView.do?bnum=" + bnum);
		}
		else {
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher(nextPage);
			
			dispatcher.forward(request, response);
		}
	}

}
