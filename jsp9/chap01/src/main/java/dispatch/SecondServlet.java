package dispatch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/disp/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 105L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		out.println("<h3>dispatch를 이용한 포워딩 실습입니다.</h3>");
		out.println("<p>이름: " + name + "</p>");
	}
}
