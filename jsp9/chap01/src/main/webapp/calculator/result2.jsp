<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.Calculator"%>
<link rel="stylesheet" href="../resources/css/calc.css">

<jsp:useBean id="calc" class="bean.Calculator" />
<jsp:setProperty property="num1" name="calc"/>
<jsp:setProperty property="num2" name="calc"/>
<jsp:setProperty property="op" name="calc"/>

<div id="container">
	<h2>계산기</h2>
	<hr>
	<% calc.calculate(); %>
	<p>계산 결과 : <jsp:getProperty property="result" name="calc"/> </p>
</div>
