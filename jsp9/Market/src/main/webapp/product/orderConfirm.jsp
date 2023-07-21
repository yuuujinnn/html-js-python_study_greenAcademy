<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 내역</title>
<link rel="stylesheet" href="resources/css/bootstrap.css">
<script src="resources/js/bootstrap.js"></script>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-4">
		<h3 class="text-left mx-4 my-4">주문 내역</h3>
		<div class="row mx-5">
		   <strong>배송 주소<br> 성명: ${shipping_name}</strong><br>
		   우편번호: ${shipping_zipCode}<br>
		   주소: ${shipping_addressName}
		</div>
		<div class="col-8" align="right">
			<p><em>배송일: ${shipping_addressName}</em></p>
		</div>
	</div>  <!-- row 끝 -->
	<div class="container my-4">
		<table class="table table-hover my-3">
			<tr>
				<th class="text-center">상품</th>
				<th class="text-center">수량</th>
				<th class="text-center">가격</th>
				<th class="text-center">소계</th>
			</tr>
			<c:forEach items="${cartList}" var="product">
				<tr>
					<td class="text-center">${product.pname}</td>
					<td class="text-center">${product.quantity}</td>
					<td class="text-center">${product.unitPrice}</td>
					<td class="text-center">${product.unitPrice * product.quantity}</td>
				</tr>
			</c:forEach>
			<tr>
				<td></td>
				<td></td>
				<td class="text-right"><strong>총액: </strong></td>
				<td class="text-center text-danger"><strong>${sum} </strong></td>
			</tr>
		</table>
		<a href="/thanksCustomer.do" class="btn btn-success mx-3">주문 완료</a>
	</div>
</body>
</html>