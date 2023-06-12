<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>core 예제</title>
</head>
<body>
	<c:set var="num" value="11" />
	<c:if test="${num % 2 == 0}">
		<p>${num}은 짝수입니다</p>
	</c:if>
	<c:if test="${num % 2 == 1}">
		<p>${num}은 홀수입니다</p>
	</c:if>
</body>
</html>