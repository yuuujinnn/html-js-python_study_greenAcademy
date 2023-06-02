<%@page import="address.AddrBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소 목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<jsp:useBean id="abDAO" class="address.AddrBookDAO" scope="application" />
<body>
	<div id="container">
		<h2>주소록</h2>
		<hr>
		<p><a href="addrForm.jsp">주소 추가</a></p>
		<table id="tbl_list">
			<thead>
				<tr>
					<th>이름</th><th>전화번호</th><th>이메일</th><th>성별</th>
				</tr>
			</thead>
			<tbody>
				<!-- ArrayList를 출력 -->
				<%
					for(int i=0; i<abDAO.getList().size(); i++) {
						AddrBook aB = abDAO.getList().get(i);	
					
				%>
				<tr>
					<td><%=aB.getUsername() %></td>
					<td><%=aB.getTel() %></td>
					<td><%=aB.getEmail() %></td>
					<td><%=aB.getGender() %></td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
</body>
</html>