<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<style>
	table, th, td{
		border: 1px solid #ccc;
		border-collapse: collapse;
		padding: 8px;
	}
</style>
</head>
<body>
	<h2>상품 목록</h2>
	<hr>
	<table>
		<thead>
			<tr>
				<th>번호</th><th>상품명</th><th>제조사</th><th>가격</th>
			</tr>
		</thead>
		<tbody>
		 <c:forEach items="${productList}" var="product" 
		 		varStatus="i">
		 	<tr>
		 		<td>${i.count}</td>
		 		<td>
		 			<a href="/jspwork2/pcontrol?action=info&pid=${product.pid}">
		 				${product.pname}
		 			</a>
		 		</td>
		 		<td>${product.maker}</td>
		 		<td>${product.price}</td>
		 	</tr>
		 </c:forEach> 
		</tbody>
	</table>
</body>
</html>