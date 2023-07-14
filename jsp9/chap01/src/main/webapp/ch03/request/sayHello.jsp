<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿼리 스트링</title>
</head>
<body>
<%
	//http://localhost:8080/ch03/request/sayHello.jsp? - null 오류
	int cnt = Integer.parseInt(request.getParameter("cnt"));

	/*int cnt = 0;
    if(request.getParameter("cnt") != null){
    	cnt = Integer.parseInt(request.getParameter("cnt"));
    }*/

	for(int i=1; i<=cnt; i++){
		out.println("안녕~ JSP!<br>");
	}
%>
</body>
</html>