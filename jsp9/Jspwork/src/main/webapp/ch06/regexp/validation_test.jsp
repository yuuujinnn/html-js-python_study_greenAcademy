<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정규 표현식 예제</title>
<script type="text/javascript">
	function checkMember(){
		//alert("test");
		//1. 아이디나 비밀번호가 비어있을 때 처리
		//2. 비밀번호에 동일한 아이디가 포함되어 있을때 처리
		//"비밀번호는 아이디를 포함할 수 없습니다."
		//3. 이름은 숫자로 시작할 수 없습니다.
		let form = document.member;
		let id = form.id.value;
		let pw = form.passwd.value;
		let name = form.uname.value;
		
		let regExp = /^[a-zA-Z가-힣]/; //문자로 시작해야함
		if(id == ""){
			alert("아이디를 입력해 주세요");
			form.id.focus();
			return false;
		}else if(pw == ""){
			alert("비밀번호를 입력해 주세요");
			form.passwd.focus();
			return false;
		}else if(pw.search(id) > -1){ //0보다 크거나 같으면 찾음
			alert("비밀번호는 아이디를 포함할 수 없습니다.");
			form.passwd.select();
			return false;
		}else if(!regExp.test(name)){
			alert("이름은 숫자로 시작할 수 없습니다..");
			form.uname.select();
			return false;
		}
		else{
			form.submit();
		}
	}
</script>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="test_process.jsp" method="post" name="member">
		<p>아이디: <input type="text" name="id">
		<p>비밀번호: <input type="password" name="passwd">
		<p>이름 : <input type="text" name="uname">
		<p>
			<button type="button" onclick="checkMember()">가입하기</button>
		</p>
	</form>
</body>
</html>