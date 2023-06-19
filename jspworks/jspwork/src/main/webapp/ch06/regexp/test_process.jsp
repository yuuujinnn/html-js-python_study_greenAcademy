<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("passwd");
	String name = request.getParameter("uname");
%>
<p>아이디: <%= id %>
<p>비밀번호: <%= pw %>
<p>비밀번호: <%= name %>