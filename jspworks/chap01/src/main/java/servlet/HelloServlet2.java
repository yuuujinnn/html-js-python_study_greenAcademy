package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello2")
public class HelloServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//문서 유형과 한글 인코딩 호출
		response.setContentType("text/html; charset=utf-8");
		
		//출력 객체 out 생성
		PrintWriter out = response.getWriter();
		
		//int cnt = Integer.parseInt(request.getParameter("cnt"));
		int cnt = 0;
		if(request.getParameter("cnt") != null) {
			cnt = Integer.parseInt(request.getParameter("cnt"));
		}
		
		for(int i=0; i<cnt; i++) {
			out.println(i+1 + ": 안녕 Servlet!<br>");
		}
	}
	
	public void destroy() {
		System.out.println("destroy() 호출");
	}

}
