<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 예제</title>
</head>
<%
	pageContext.setAttribute("cart", "egg");
%>
<body>
	<!-- el 사용 -->
	<h3>${cart}</h3>
	
	<%-- <h3>${param.n}</h3> --%>
	<h3>${empty param.n ? "값이 비었습니다." : param.n}</h3>
	
	<h3>${names[0]}</h3>
	<h3>${names[1]}</h3>
	<h3>${names[2]}</h3>
	
	<h3>${numberList[0]}</h3>
	<h3>${numberList[1]}</h3>
	<h3>${numberList[2]}</h3>
	
	<!-- jstl 사용 -->
	<h3>
	<c:forEach var="name" items="${names}">
		<c:out value="${name}" ></c:out>
	</c:forEach>
	</h3>
	
	<h3>
	<c:forEach var="number" items="${numberList}">
		<c:out value="${number}"></c:out>
	</c:forEach>
	</h3>
</body>
</html>