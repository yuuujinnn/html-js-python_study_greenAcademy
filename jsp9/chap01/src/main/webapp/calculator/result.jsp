<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="bean.Calculator"%>
<link rel="stylesheet" href="../resources/css/calc.css">

<div id="container">
	<h2>계산기</h2>
	<hr>
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
	    int num2 = Integer.parseInt(request.getParameter("num2"));
	    String op = request.getParameter("op");
	    
	    Calculator calc = new Calculator();
	    calc.setNum1(num1);
	    calc.setNum2(num2);
	    calc.setOp(op);
	    
	    calc.calculate();
	%>
	<p>계산 결과 : <%=calc.getResult() %>
</div>
