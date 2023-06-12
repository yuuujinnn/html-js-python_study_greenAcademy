<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유효성 검사</title>
<script type="text/javascript">
	function checkForm(){
		alert("아이디: " + document.loginForm.userid.value + 
			  "\n비밀번호: " + document.loginForm.passwd.value)
	}

</script>
</head>
<body>
	<form action="loginProcess.jsp" method="post" name="loginForm">
		<p>
			<label for="userid">아이디: </label>
			<input type="text" name="userid" id="userid">
		</p>
		<p>
			<label for="passwd">비밀번호: </label>
			<input type="password" name="passwd" id="passwd">
		</p>
		<p><input type="submit" value="로그인" onClick="checkForm()"></p>
	</form>
</body>
</html>