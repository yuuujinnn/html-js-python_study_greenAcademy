<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점 처리</title>
</head>
<body>
	<c:set var="score" value="${param.score.trim()}" />
	<h3>시험 점수:  <c:out value="${score}" /></h3>
	<!-- 다중 조건문 -->
	<c:choose>
		<c:when test="${score >= 90 and score <= 100}">
			<h3>A학점 입니다.</h3>
		</c:when>
		<c:when test="${score >= 80 and score < 90}">
			<h3>B학점 입니다.</h3>
		</c:when>
		<c:when test="${score >= 70 and score < 80}">
			<h3>C학점 입니다.</h3>
		</c:when>
		<c:when test="${score >= 60 and score < 70}">
			<h3>D학점 입니다.</h3>
		</c:when>
		<c:otherwise>
			<h3>F학점 입니다.</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>