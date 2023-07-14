<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="calc" class="bean.CalcBean" />
	
	<%
		int num = calc.calculate(4);
	
		out.println("4의 세제곱: " + num);
	%>
</body>
</html>