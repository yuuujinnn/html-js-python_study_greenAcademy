<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>날짜를 다양한 형식으로 표시하기</h2>
	<jsp:useBean id="now" class="java.util.Date" />
	<p>현재 날짜 및 시간: ${now}</p>
	<p><fmt:formatDate value="${now}" type="date" /></p>
	<p><fmt:formatDate value="${now}" type="time" /></p>
	<p><fmt:formatDate value="${now}" pattern="yyyy-MM-dd hh:mm:ss a" /></p>
</body>
</html>