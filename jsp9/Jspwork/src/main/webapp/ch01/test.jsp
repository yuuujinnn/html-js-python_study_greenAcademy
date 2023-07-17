<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num = 10;
	
		String result = "";
		if(num % 2 == 0){
			result = "짝수입니다.";
		}
		else{
			result = "홀수입니다.";
		}
	%>
	<p>결과는 : <%=result %>
</body>
</html>