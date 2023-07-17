<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//쿼리 스트링 연습
	//cnt를 입력할 수 있는 코드
	//int cnt = Integer.parseInt(request.getParameter("cnt"));
	int cnt = 0;
    if(request.getParameter("cnt") != null){ //객체이므로 null로 처리
    	cnt = Integer.parseInt(request.getParameter("cnt"));
    }
    
	for(int i=1; i<=cnt; i++){
		out.println("안녕~ JSP<br>");
	}

%>
<h3>주소 표시줄에 ?cnt=숫자를 입력해 주세요</h3>