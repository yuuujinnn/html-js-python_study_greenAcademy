<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl 예제</title>
</head>
<body>
	<h2>JSTL 예제</h2>
	<hr>
	
	<h3>set, out</h3>
	<c:set var="product1" value="삼성 Galaxy"></c:set>
	<c:set var="product2" value="애플 iphone"></c:set>
	<c:set var="intArray" value="${{1, 2, 3, 4}}" />
	<p>
		product1: <c:out value="${product1}"></c:out>
	</p>
	<p>
		product2: <c:out value="${product2}"></c:out>
	</p>
	
	<h3>forEach: 배열 출력</h3>
	<ul>
		<!-- ${i.index}는 0번부터 시작함 -->
		<c:forEach items="${intArray}" var="num"
			varStatus="i">
			<li>${i.index}: ${num}</li>
		</c:forEach>
	</ul>
	
	<h3>if</h3>
	<c:set var="checkout2" value="true"></c:set>
	<c:if test="${checkout}">
		<p>주문 제품: ${product1}
	</c:if>
	<c:if test="${!checkout}"> <!-- var=checkout2로 변경하면 실행됨 -->
		<p>주문 제품이 아님
	</c:if>
	
	<c:if test="${not empty product1}">
		<p>${product1} 이미 추가됨!</p>
	</c:if>
	
	<h3>choose, when, otherwise</h3>
	<c:choose>
		<c:when test="${checkout}">
			<p>주문 제품: ${product2}
		</c:when>
		<c:otherwise>
			<p>주문 제품이 아님
		</c:otherwise>
	</c:choose>
	
	<h3>forTokens</h3>
	<!-- delims(델리미터): 구분기호 -->
	<c:forTokens items="egg|coffee|water" delims="|" 
			var="cart" varStatus="i">
		${i.index}:
		<c:if test="${i.first}"></c:if>
			${cart}
		<c:if test="${i.last}"></c:if>
	</c:forTokens>
</body>
</html>