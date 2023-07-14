<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	Enumeration<String> en = request.getHeaderNames();
	
	while(en.hasMoreElements()){
		String headerName = en.nextElement();
		String headerValue = request.getHeader(headerName);
		
		out.println(headerName + ":" + headerValue + "<br>");
	}
%>