<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div id="container">
		<section id="board_detail">
			<h2>게시글 수정</h2>
			<form action="/updateProcess.do" method="post">
				<input type="hidden" name="bnum" value="${board.bnum}">
				<table>
					<tbody>
						<tr>
							<td>
								<input type="text" name="title" value="${board.title}">
							</td>
						</tr>
						<tr>
							<td>
								<textarea rows="8" cols="100"
									name="content">${board.content}</textarea>
							</td>
						</tr>
						<tr>
							<td>
								<button type="submit">저장</button>
								<button type="reset">취소</button>
								<a href="/boardList.do">
									<button type="button">목록</button>
								</a>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</section>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>