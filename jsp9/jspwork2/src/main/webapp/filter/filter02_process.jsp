<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("passwd");
%>
<p>입력된 id 값: <%=id %>
<p>입력된 passwd 값: <%=pw %>