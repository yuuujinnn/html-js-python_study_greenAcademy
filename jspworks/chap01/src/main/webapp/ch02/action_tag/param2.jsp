<%@page import="java.util.Calendar"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH) + 1;
    int date = cal.get(Calendar.DATE);
    
    String datetime = year + "년 " + month + "월 " + date + "일 ";
%>
<body>
	<h2>include 액션 태그</h2>
	<jsp:include page="param2_data.jsp">
		<jsp:param value='<%= URLEncoder.encode("오늘의 날짜와 시각") %>' name="title"/>
		<jsp:param value='<%= Calendar.getInstance().getTime() %>' name="date"/>
	</jsp:include>
	
	<%-- <jsp:param value='<%= "Date & Time" %>' name="title"/> --%>
</body>
</html>