<%@ page import="beans.Calculator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../resources/css/style.css">
<div id="container">
	<h2>계산기</h2>
	<hr>
	<%
		//폼에 입력된 데이터 가져오기
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("op");
		
		//Calculator 객체 생성
		Calculator calc = new Calculator();
		calc.setNum1(num1); //첫번째수 입력(저장)
		calc.setOp(op);
		calc.setNum2(num2); //두번째수 입력
		
		//계산하는 함수 호출
		calc.calculate();
	%>
	<p>계산 결과: <%=calc.getResult() %></p>
</div>
