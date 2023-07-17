<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h3>세션을 삭제하기 전</h3>
<%
	//세션 가져오기
	String id = (String)session.getAttribute("userId");  //corona
	String pw = (String)session.getAttribute("userPw");  //2019
	
	out.println("설정된 세션의 속성값[1]: " + id + "<br>");
	out.println("설정된 세션의 속성값[2]: " + pw + "<br>");
	
	session.removeAttribute("userId");  //세션 이름 "userId"를 삭제
%>
<h3>세션을 삭제한 후</h3>
<%
	//세션 가져오기
	id = (String)session.getAttribute("userId");  //null
	pw = (String)session.getAttribute("userPw");  //2019
	
	out.println("설정된 세션의 속성값[1]: " + id + "<br>");
	out.println("설정된 세션의 속성값[2]: " + pw + "<br>");
%>