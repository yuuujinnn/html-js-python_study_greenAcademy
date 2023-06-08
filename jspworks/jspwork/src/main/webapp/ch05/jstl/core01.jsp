<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 예제</title>
<%
	//모델 생성
	//한페이지에서 수정하고싶을때
	pageContext.setAttribute("cart", "계란");
%>
</head>
<body>
	<h3>${cart}</h3>
	
	<%-- <%
		int num = 11;
	
		if(num % 2 == 0) {
			out.println("짝수");
		} else {
			out.println("홀수");
	%> --%>
	
	<c:set var="num" value="11"></c:set>
	<c:if test="${num % 2 == 0}">
		<c:out value="${'짝수입니다.'}"></c:out>
	</c:if>
		<c:if test="${num % 2 == 1}">
		<c:out value="${'홀수입니다.'}"></c:out>
	</c:if>
	<br>
	<!-- 구구단 5단 -->
	<c:forEach var="i" begin="2" end="9">
		<c:forEach var="j" begin="1" end="9">
			<c:out value="${i} x ${j} = ${i*j}" /><br>
		</c:forEach>
		<br>
	</c:forEach>
	
</body>
</html>