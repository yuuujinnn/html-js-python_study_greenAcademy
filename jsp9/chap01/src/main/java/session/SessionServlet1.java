package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sess1")
public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//문서 유형과 한글 인코딩 호출
		response.setContentType("text/html; charset=utf-8");
		
		//출력 객체 out 생성
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		out.println(session.getId() + "<br>");
		out.println(new Date(session.getCreationTime()) + "<br>");
		out.println(new Date(session.getLastAccessedTime()) + "<br>");
		out.println(session.getMaxInactiveInterval() + "<br>");
		if(session.isNew()) {
			out.print("새 새션이 만들어졌습니다.");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
