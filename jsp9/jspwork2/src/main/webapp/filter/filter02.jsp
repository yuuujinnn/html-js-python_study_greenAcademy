<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 인증</title>
</head>
<body>
	<form action="filter02_process.jsp" method="post">
		<p>
		   아이디 <input type="text" name="id">
        </p>
		<p>
		   비밀번호 <input type="password" name="passwd">
        </p>
        <button type="submit">로그인</button>
	</form>
</body>
</html>