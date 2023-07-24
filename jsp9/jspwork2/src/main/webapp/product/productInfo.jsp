<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보</title>
<style type="text/css">
	ul li{margin: 12px;}
</style>
</head>
<body>
	<h2>상품 정보</h2>
	<hr>
	<ul>
		<li>상품 코드: ${product.pid}</li>
		<li>상품 이름: ${product.pname}</li>
		<li>제조사: ${product.maker}</li>
		<li>가격: ${product.price}</li>
		<li>등록일: ${product.date}</li>
	</ul>
</body>
</html>