<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user 추가</title>
</head>
<body>
	<%@ include file="dbconn.jsp" %>
	<%
		PreparedStatement pstmt = null;
	
		try{
			String sql = "insert into myuser values "
					 + "(102, 'cloud123', '구름', '010-2222-3333')";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();  //실행 처리
			out.println("회원 추가");
		}catch(Exception e){
			out.println(e.getMessage());
		}
	%>
</body>
</html>