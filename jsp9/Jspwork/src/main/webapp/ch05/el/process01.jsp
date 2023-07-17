<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
<style>
	#container{width: 80%; margin: 30px auto; text-align: center;}
	fieldset{width: 450px; margin: 0 auto;}
	label{width: 100px; float:left; text-align: right;}
	table{width: 600px; margin: 0 auto;}
	table, th, td{border: 1px solid #ccc; border-collapse: collapse }
	table th, td{padding: 10px;}
	table thead{background: #eee;}
</style>
</head>
<%
	//MVC -> Controller 역할
	request.setCharacterEncoding("utf-8"); //한글 인코딩

	//데이터 name 속성 받기
	String id =	request.getParameter("userid");
	String pwd = request.getParameter("passwd");
	String name = request.getParameter("uname");
%>
<body>
	<div id="container">
		<h3>회원 정보</h3>
		<hr>
		<table>
			<thead>
				<tr>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>이 름</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<!-- MVC -> Model(데이터) -->
					<td><%=id %></td>
					<td><%=pwd %></td>
					<td><%=name %></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>