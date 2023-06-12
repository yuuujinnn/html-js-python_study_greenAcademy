<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<style type="text/css">
	#container{width: 80%; margin:30px auto; text-align: center}
	select{padding: 5px;}
</style>
</head>
<jsp:useBean id="product" class="mvc.Product" />
<body>
	<div id="container">
		<h2>상품 목록</h2>
		<hr>
		<form action="selProduct.jsp" method="get">
			<select name="select">
			<%
				for(String item : product.getProductList()){
					out.println("<option>" + item + "</option>");
				}
			%>
				<!-- <option>참외</option> -->
			</select>
			<input type="submit" value="선택">
		</form>
	</div>
</body>
</html>