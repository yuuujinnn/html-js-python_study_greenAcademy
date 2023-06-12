package mvc;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MVCTest2 extends HttpServlet{

	private static final long serialVersionUID = 20L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//짝수/홀수를 판정해서 결과를 jsp에 보내기
		
		int num = 0;
		if(request.getParameter("num") != null) {
			num = Integer.parseInt(request.getParameter("num"));
		}
		
		String result = "";   //모델(결과 데이터)
		if(num % 2 == 0) {
			result = "짝수입니다.";
		}else {
			result = "홀수입니다.";
		}
		
		//Model 생성
		request.setAttribute("result", result);
		
		//포워딩
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/mvc/mvc02.jsp");
		
		dispatcher.forward(request, response);
	}
	
}
