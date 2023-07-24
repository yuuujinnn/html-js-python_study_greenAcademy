<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome~</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-3">
		<h3 class="text-left mx-4 my-4">회원 목록</h3>
		<div>
			<table class="table table-hover">
				<thead>
					<tr class="text-center">
						<th>번호</th><th>아이디</th><th>이름</th><th>가입일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${memberList}" var="member"
					           varStatus="i">
					<tr>
						<td class="text-center">${i.index + 1}</td>
						<td class="text-center">
							<a href="/memberInfo.do?mid=${member.mid}">${member.mid}</a>
						</td>
						<td class="text-center">${member.mname}</td>
						<td class="text-center">${member.regDate}</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>