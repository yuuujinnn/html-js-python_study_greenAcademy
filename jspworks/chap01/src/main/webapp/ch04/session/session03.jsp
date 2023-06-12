<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h3>세션 삭제 전</h3>
<%
	String id = (String)session.getAttribute("userId");

	out.println("userId: " + id);
	
	session.removeAttribute("userId");

%>
<h3>세션 삭제 후</h3>
<%
	id = (String)session.getAttribute("userId");

	out.println("userId: " + id);

%>