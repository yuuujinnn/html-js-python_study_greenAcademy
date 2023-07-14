<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 선택</title>
<style type="text/css">
	#container{width: 80%; margin:30px auto; text-align: center}
</style>
</head>
<jsp:useBean id="product" class="mvc.Product" />
<body>
	<div id="container">
		<h2>상품 선택</h2>
		<hr>
		<p>선택한 상품: ${param.select} </p>    
		<p>num1 + num2 = ${product.num1 + product.num2}
	</div>
</body>
</html>