<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userID = "";
	if(session.getAttribute("userID") != null){ //object 반환
		userID = (String)session.getAttribute("userID");
	}

%>
<h3><%=userID %>님 반갑습니다.</h3>
<a href="session_out.jsp">로그아웃</a>

