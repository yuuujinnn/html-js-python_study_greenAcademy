<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    #container{width: 80%; margin:30px auto; text-align: center}
    table{width: 450px; margin: 0 auto;}
	table, td{border: 1px solid #ccc; border-collapse: collapse;}
	table td{padding: 10px; text-align: center}
	table input[type="text"], input[type="password"]{width: 200px; 
		padding: 5px;}
</style>
</head>
<body>
	<div id= "container">
		<h2>회원 가입</h2>
		<form action="member01Process.jsp" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="passwd"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="가입">
						<input type="reset" value="취소">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>