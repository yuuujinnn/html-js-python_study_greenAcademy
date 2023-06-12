<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//세션 가져오기
	String id = (String)session.getAttribute("userId");  //null
	String pw = (String)session.getAttribute("userPw");  //2019
	
	out.println("설정된 세션의 속성값[1]: " + id + "<br>");
	out.println("설정된 세션의 속성값[2]: " + pw + "<br>");
	
	//세션 모두 삭제
	session.invalidate();
%>
