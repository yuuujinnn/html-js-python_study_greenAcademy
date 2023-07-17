package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	private static final long serialVersionUID = 100L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() 호출");
	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
	}

}
