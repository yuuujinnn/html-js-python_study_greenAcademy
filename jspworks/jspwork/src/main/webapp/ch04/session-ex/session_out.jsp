<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	session.invalidate();  //세션 해제(삭제)
	
	response.sendRedirect("session.jsp"); //페이지 이동

%>