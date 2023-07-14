<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
	<h2>오늘의 날짜 및 시간</h2>
	
	<%
	    LocalDateTime now = LocalDateTime.now();
	
		DateTimeFormatter datetime 
			= DateTimeFormatter.ofPattern("yyyy-mm-dd a hh:mm:ss");
		out.println(now.format(datetime));
	%>
</body>
</html>