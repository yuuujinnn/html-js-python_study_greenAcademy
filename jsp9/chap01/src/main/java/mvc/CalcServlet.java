package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num = 0;
		if(request.getParameter("num") != null){
			num = Integer.parseInt(request.getParameter("num"));
		}
		
		String result = "";
		if(num % 2 == 0){
			result = "짝수";
		}
		else{
			result = "홀수";
		}
		
		//model
		request.setAttribute("result", result);
		
		//포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher("calc.jsp");
		dispatcher.forward(request, response);
	}

}
