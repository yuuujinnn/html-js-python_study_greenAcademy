<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현문 태그</title>
</head>
<%!
	int count = 0;
%>
<body>
	<h2>방문해 주셔서 감사합니다.</h2>
	
	<!-- 선 증가(전치 연산자) -->
	<h3>Page Count is <%= ++count %></h3>
	
</body>
</html>

