<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Beans</title>
</head>
<body>
	<jsp:useBean id="member" class="beans.MemberBean" />
	
	<p>아이디: <%=member.getId() %></p>
	<p>이  름: <%=member.getName() %></p>
</body>
</html>