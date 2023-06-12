<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//여러 값을 넘겨 받을때 사용
	String[] fruit = request.getParameterValues("fruit");
%>

<p>선택한 과일:
<%
	for(int i=0; i<fruit.length; i++){
		out.println(fruit[i]);
	}
%>
</p>