package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 20L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//폼 데이터 가져옴
		int num1 = Integer.parseInt(request.getParameter("num1"));
	    int num2 = Integer.parseInt(request.getParameter("num2"));
	    String op = request.getParameter("op");
	    int result = 0;
	    
	    //연산
	    switch(op) {
	    case "+": 
	    	result = num1 + num2; break;
	    case "-": 
	    	result = num1 - num2; break;
	    case "*": 
	    	result = num1 * num2; break;
	    case "/": 
	    	result = num1 / num2; break;
	    default: 
	    	System.out.println("지원되지 않는 기능입니다.");
	    }
	    
	    //html 형식으로 응답
	    response.setContentType("text/html; charset=utf-8");
	    
	    PrintWriter out = response.getWriter(); //출력 스트림 out 객체 생성
	    
	    out.append("<link rel=\"stylesheet\" href=\"../resources/css/calc.css\">")
	       .append("<div id=\"container\">")
	       .append("<h2>계산기</h2><hr>")
	       .append("<p>계산 결과: " + result + "</p></div>");
	}
	
}
