<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num = 0;
	if(request.getParameter("num") != null){
		num = Integer.parseInt(request.getParameter("num"));
	}
	
	String result = "";
	if(num % 2 == 0){
		result = "짝수";
	}
	else{
		result = "홀수";
	}
%>
<body>
	<%=result %>
</body>
</html>