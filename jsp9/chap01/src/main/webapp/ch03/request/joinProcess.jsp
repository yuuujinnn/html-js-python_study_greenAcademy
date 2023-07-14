<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	
	String phone1 = request.getParameter("phone1");
	String phone2 = request.getParameter("phone2");
	String phone3 = request.getParameter("phone3");
	
	String gender = request.getParameter("gender");
	
	//String hobby1 = request.getParameter("hobby1");
	String[] hobby = request.getParameterValues("hobby");
	String comment = request.getParameter("comment");

%>

<p>아이디: <%=id %>
<p>비밀번호: <%=passwd %>
<p>이 름: <%=name %>
<p>연락처: <%=phone1 %> - <%=phone2 %> - <%=phone3 %>
<p>성 별: <%=gender %>
<p>취 미: 
<%
	for(int i=0; i<hobby.length; i++){
		out.println(hobby[i]);
	}
%>
<p>가입인사: <%=comment %>