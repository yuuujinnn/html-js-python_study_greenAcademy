<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//쿠키 가져오기
	Cookie[] cookies = request.getCookies();
	out.println("현재 설정된 쿠키의 개수=>" + cookies.length + "<br>");
	out.println("========================================<br>");

	for(int i=0; i<cookies.length; i++){
		out.println("쿠키 이름: " + cookies[i].getName() + "<br>");
		out.println("쿠키값: " + cookies[i].getValue() + "<br>");
		out.println("========================================<br>");
	}
%>