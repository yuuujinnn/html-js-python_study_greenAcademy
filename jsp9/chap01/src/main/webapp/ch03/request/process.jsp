<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");	

	String name = request.getParameter("name");

%>

<p>이 름: <%= name %> </p>

