<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/login" method="post">
		<p>
			<label for="userid">아이디: </label>
			<input type="text" name="userid" id="userid">
		</p>
		<p>
			<label for="passwd">비밀번호: </label>
			<input type="password" name="passwd" id="passwd">
		</p>
		<p><input type="submit" value="로그인"></p>
	</form>
</body>
</html>