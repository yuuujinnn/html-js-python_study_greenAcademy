<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="cookieProcess.jsp" method="post">
		<p>
			<label for="id">아이디: </label>
			<input type="text" id="id" name="id">
		</p>
		<p>
			<label for="passwd">패스워드: </label>
			<input type="password" id="passwd" name="passwd">
		</p>
		<p><input type="submit" value="전송"></p>
	</form>
</body>
</html>