<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	//전역 변수나 함수 위치
	int pageCount = 0;

	void addCount(){
		pageCount++;  //후치 증가
	}
%>

<%
	addCount(); //addCount() 호출
%>
<p>이 사이트 방문은 <%=pageCount %>번째 입니다.</p>
