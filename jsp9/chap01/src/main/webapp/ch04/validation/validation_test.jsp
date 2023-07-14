<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유효성 검사</title>
<script type="text/javascript">
	function checkForm(){
		let form = document.loginForm;
		let id = form.userid.value;
		let pw = form.passwd.value;
		
		console.log(pw.search(id));
		if(id == ""){
			alert("아이디를 입력해 주세요");
			form.userid.focus();
			return false;
		}else if(pw == ""){
			alert("비밀번호를 입력해 주세요");
			form.passwd.focus();
			return false;
		}else if(pw.search(id) > -1){
			alert("비밀번호는 아이디를 포함할 수 없습니다.");
			form.passwd.select();
			return false;
		}else{
			form.submit();
		}
	}
</script>
</head>
<body>
	<form action="loginProcess2.jsp" method="post" name="loginForm">
		<p>
			<label for="userid">아이디: </label>
			<input type="text" name="userid" id="userid">
		</p>
		<p>
			<label for="passwd">비밀번호: </label>
			<input type="password" name="passwd" id="passwd">
		</p>
		<p><input type="button" value="로그인" onClick="checkForm()"></p>
	</form>
</body>
</html>