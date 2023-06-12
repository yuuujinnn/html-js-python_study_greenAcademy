<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pwd = request.getParameter("passwd");
	String name = request.getParameter("name");

%>
<style>
    #container{width: 80%; margin:30px auto; text-align: center}
    table{width: 450px; margin: 0 auto;}
	table, td{border: 1px solid #ccc; border-collapse: collapse;}
	table td{padding: 10px; text-align: center}
	table input[type="text"], input[type="password"]{width: 200px; 
		padding: 5px;}
</style>
<body>
	<div id= "container">
		<h2>회원 정보</h2>
		<table>
			<tr>
				<td>아이디</td><td>비밀번호</td><td>이름</td>
			</tr>
			<tr>
				<td><%=id %></td>
				<td><%=pwd %></td>
				<td><%=name %></td>
	
			</tr>
		</table>
	</div>
</body>