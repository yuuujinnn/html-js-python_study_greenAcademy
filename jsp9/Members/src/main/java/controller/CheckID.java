package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;

@WebServlet("/checkid")
public class CheckID extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		MemberDAO dao = new MemberDAO();
		String id = request.getParameter("id");
		
		int duplicatedID = dao.duplicatedID(id);
		
		if(duplicatedID == 1) { //아이디가 중복되었으면
			out.println("not_usable"); //not_usable 문자 전송
		}else {
			out.println("usable");
		}
		
		/*boolean duplicatedID = dao.duplicatedID(id);
		
		if(duplicatedID==true) { //아이디가 중복되었으면
			out.println("not_usable"); //not_usable 문자 전송
		}else {
			out.println("usable");
		}*/
	}

}
