package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/login")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 인코딩(폼에 입력된 한글 처리)
		request.setCharacterEncoding("utf-8");
		
		//문서 컨텐츠 유형
		response.setContentType("text/html; charset=utf-8");
		
		//jsp 폼에 입력된 자료 수집
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String phone = request.getParameter("phone");
		
		//출력 객체 생성
		PrintWriter out = response.getWriter();
		
		String data = "<html><body>";
		       data += "<p>아이디: " + userid + "</p>";
		       data += "<p>비밀번호: " + passwd + "</p>";
		       data += "<p>전화번호: " + phone + "</p>";
		       data += "</body></html>";
		       
		out.println(data);
	}
}
