<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 태그</title>
</head>
<body>
	<h2>Scripting Tag</h2>
	<!-- 선언문 태그 -->
	<%!
		int num1 = 10, num2 = 20;
		int sum = 0;
	%>
	<!-- 스크립트릿 태그 -->
	<%
		sum = num1 + num2;
	%>
	<!-- 표현문 태그 -->
	<h3>합계: <%=sum %></h3>
</body>
</html>