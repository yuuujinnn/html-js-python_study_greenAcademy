<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div id="container">
	   <section id="boardlist">
		<h2>게시판 목록</h2>
		<table id="tbl_list">
			<thead>
				<tr>
					<th>글번호</th>
					<th>글제목</th>
					<th>작성일</th>
					<th>조회수</th>
					<th>글쓴이</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${boardList}">
				<tr>
					<td><c:out value="${board.bnum}" /></td>
					<td>
						<a href="/boardView.do?bnum=${board.bnum}">
							<c:out value="${board.title}" />
						</a>
					</td>
					<td><fmt:formatDate value="${board.regDate}"
							pattern="yyyy-MM-dd HH:mm:ss" /> </td>
					<td><c:out value="${board.hit}" /></td>
					<td><c:out value="${board.memberId}" /></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="btnWrite">
			<a href="/boardForm.do">
				<button type="button">글쓰기</button>
			</a>
		</div>
		</section>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>