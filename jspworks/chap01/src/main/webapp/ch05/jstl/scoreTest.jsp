<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>점수 출력</title>
<body>

<c:set var="score" value="${param.score}"></c:set>
<h2>시험 점수: ${score}</h2>
<c:choose>
	<c:when test="${score >= 90 && score <= 100}">
		<h3>A학점 입니다.</h3>
	</c:when>
	<c:when test="${score >= 80 && score < 90}">
		<h3>B학점 입니다.</h3>
	</c:when>
	<c:when test="${score >= 70 && score < 80}">
		<h3>C학점 입니다.</h3>
	</c:when>
	<c:when test="${score >= 60 && score < 70}">
		<h3>D학점 입니다.</h3>
	</c:when>
	<c:otherwise>
		<h3>F학점 입니다.</h3>
	</c:otherwise>
</c:choose>

</body>



