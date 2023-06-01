<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 빈즈(Java Beans)</title>
</head>
<body>
	<!-- id는 객체와 같음(new 한 것임) -->
	<jsp:useBean id="calc" class="beans.CalcBean"></jsp:useBean>
	<%
		int num = calc.calculate(3);
	%>
	
	<p>결과: <%=num %></p>
</body>
</html>