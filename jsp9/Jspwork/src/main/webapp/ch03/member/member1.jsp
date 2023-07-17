<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Beans</title>
</head>
<body>
	<!-- 실제 클래스의 이름 - 패키지이름.클래스이름 -->
	<jsp:useBean id="member" class="beans.MemberBean" />
	
	<p>아이디: <%=member.getId() %> </p>
	<p>이  름: <%=member.getName() %> </p>
</body>
</html>