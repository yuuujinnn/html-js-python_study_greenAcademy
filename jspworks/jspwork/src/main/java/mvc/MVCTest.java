package mvc;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc/mvc01")
public class MVCTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String season = "여름";
		String[] seasons = {"봄", "여름", "가을", "겨울"};
		
		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		
		//모델 생성해서 view에 보냄
		request.setAttribute("season", season);
		request.setAttribute("seasons", seasons);
		request.setAttribute("numberList", numberList);
		
		//포워딩
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/mvc/mvc01.jsp");
		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
