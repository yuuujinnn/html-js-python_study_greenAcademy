<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param 태그</title>
</head>
<body>
	<jsp:include page="param2_data.jsp">
		<jsp:param value='<%= URLEncoder.encode("관리자") %>' name="id"/>
	</jsp:include>
</body>
</html>