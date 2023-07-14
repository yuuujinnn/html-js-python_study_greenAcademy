<%@page import="java.util.Calendar"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재 날짜와 시간 표시</title>
</head>
<body>
	<%
		Calendar cal = Calendar.getInstance();
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH) + 1;
	    int date = cal.get(Calendar.DATE);
	    
	    String datetime = year + "년 " + month + "월 " + date + "일 ";
	%>
	
	<%= datetime %>
	
	<%-- <h2>현재 날짜와 시간은 <%=LocalDateTime.now() %></h2> --%>
	<%-- <h2>현재 날짜와 시간은 <%=current_time %></h2> --%>
</body>
</html>
