<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글 수정</title>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div id="container">
		<section id="reply_update">
			<h2>댓글 수정</h2>
			<form action="/updateReply.do" method="post">
				<input type="hidden" name="bnum" value="${reply.bnum}">
				<input type="hidden" name="rno" value="${reply.rno}">
				<p>
					<textarea rows="4" cols="60"
						name="rcontent">${reply.rcontent}</textarea>
				</p>
				<p>
					작성자: <c:out value="${reply.replyer }" />
				</p>
				<button type="submit">수정하기</button>
			</form>
		</section>
	</div>
</body>
</html>