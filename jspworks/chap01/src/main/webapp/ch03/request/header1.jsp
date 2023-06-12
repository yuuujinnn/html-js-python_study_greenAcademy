<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String hostValue = request.getHeader("host");
    String alValue = request.getHeader("accept-language");

	out.println(hostValue + "<br>");
	out.println(alValue + "<br>");
%>