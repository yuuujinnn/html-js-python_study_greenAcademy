<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인</title>
</head>
<body>
	<form action="j_security_check" method="post">
		<p>아이디: <input type="text" name="j_username">
		<p>패스워드: <input type="password" name="j_password">
		<p><input type="submit" value="로그인"></p>
	</form>
</body>
</html>