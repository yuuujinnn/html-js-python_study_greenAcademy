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
	    LocalDateTime now = LocalDateTime.now();
	
		DateTimeFormatter datetime 
			= DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		//out.println(now.format(datetime));
		String current_time = now.format(datetime);
	%>
	
	<%-- <h2>현재 날짜와 시간은 <%=LocalDateTime.now() %></h2> --%>
	<h2>현재 날짜와 시간은 <%=current_time %></h2>
</body>
</html>
