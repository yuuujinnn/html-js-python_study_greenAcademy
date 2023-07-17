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
		<!-- 검색 폼 -->
		<form action="" method="get" class="search_form">
			<select name="field" class="sel_field">
				<option ${(field eq "title")?"selected":""} value="title">제목</option>
			    <option ${(field eq "memberId")?"selected":""} value="memberId">작성자</option>
			</select>
		    <input type="text" name="kw" value="${kw}" class="in_kw">
		    <button type="submit">검색</button>
		</form>
		
		<!-- 목록 -->
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
		
		<!-- 페이지 처리 영역 -->
		<div class="pagination">
			<!-- 이전 페이지 -->
			<c:if test="${startPage > 1}">
				<a href="/boardList.do?pageNum=${startPage-1}">&laquo;</a>
			</c:if>
			<c:if test="${startPage == 1}">
				<a href="">&laquo;</a>
			</c:if>
			
			<!-- 페이지 리스트 -->
			<c:forEach var="i" begin="1" end="${endPage}">
			
				<c:if test="${currentPage == i}">
					<a href="/boardList.do?pageNum=${i}">
						<span class='page'>${i}</span>
					</a>
				</c:if>
				<c:if test="${currentPage != i}">
					<a href="/boardList.do?pageNum=${i}">${i}</a>
				</c:if>
			</c:forEach>
			
			
			<!-- 다음 페이지 -->
			<c:if test="${endPage > startPage}">
			   <a href="/boardList.do?pageNum=${startPage+1}">&raquo;</a>
			</c:if>
			<c:if test="${endPage == startPage}">
				<a href="">&raquo;</a>
			</c:if>
		</div>
		
		<!-- 글쓰기 버튼 -->
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