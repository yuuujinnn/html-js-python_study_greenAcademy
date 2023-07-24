<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 오류 처리</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-3">
		<div class="text-center">
			<h2 class="alert-danger p-3 my-3">요청하신 페이지를 찾을 수 없습니다.</h2>
		    <h5><%=request.getRequestURL() %></h5>
		</div>
		<p>
			<a href="/productList.do" class="btn btn-secondary">&laquo; 상품 목록</a>
		</p>
	</div>
</body>
</html>