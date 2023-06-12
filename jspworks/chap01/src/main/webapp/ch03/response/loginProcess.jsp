<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="login" class="bean.LoginBean" />
<jsp:setProperty property="userid" name="login"/>
<jsp:setProperty property="passwd" name="login"/>

<%
	//폼에 입력된 자료 가져오기
	String id = request.getParameter("userid");
  	String pwd = request.getParameter("passwd");
  	
  	if(id.equals("admin") && pwd.equals("0000")){
  		response.sendRedirect("loginSuccess.jsp");
  	}else{
  		response.sendRedirect("loginFail.jsp");
  	}
%>


