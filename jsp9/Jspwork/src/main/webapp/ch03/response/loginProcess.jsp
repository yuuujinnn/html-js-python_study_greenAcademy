<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    //한글 인코딩 설정
	request.setCharacterEncoding("utf-8");	

	String id = request.getParameter("userid");
	String pwd = request.getParameter("passwd");
	
	if(id.equals("admin") && pwd.equals("1234")){
		out.println("로그인 성공!");
		//페이지 이동
		response.sendRedirect("loginSuccess.jsp");
	}else{
		out.println("로그인 실패!");
		response.sendRedirect("loginFail.jsp");
	}
%>
<p>아이디:<%=id %></p>
