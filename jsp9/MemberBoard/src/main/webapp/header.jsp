<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
	<div id="logo">
		<h1><a href="index.jsp">Gangnam</a></h1>
	</div>
	<nav>
	<c:choose>
		<c:when test="${empty sessionId}">
			<ul id="topMenu">
				<li><a href="memberForm.do">회원가입</a></li>
				<li><a href="memberList.do">회원목록</a></li>
				<li><a href="">게시판</a></li>
				<li><a href="loginForm.do">로그인</a></li>
			</ul>
		</c:when>
		<c:otherwise>
			<ul id="topMenu">
				<li><a href="memberForm.do">회원가입</a></li>
				<li><a href="memberList.do">회원목록</a></li>
				<li><a href="">게시판</a></li>
				<li><a href="logout.do">[${sessionId}님]로그아웃</a></li>
			</ul>
		</c:otherwise>
	</c:choose>
	</nav>
</header>