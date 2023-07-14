<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정규 표현식 예제</title>
<script type="text/javascript">
	function checkForm(){
		//alert('testing...');
		let form = document.form1;
		let name = form.uname;
		let regExp = /^[a-zA-Z가-힣]/;  //'^'은 시작을 의미함
		
		if(!regExp.test(name.value)){
			alert("이름은 숫자로 시작할수 없습니다.");
			name.select();
			return false;
		}else{
			form.submit();
		}
	}
</script>
</head>
<body>
	<form action="" method="post" name="form1">
		<p>이름 <input type="text" name="uname">
		       <input type="button" value="가입" onclick="checkForm()">
		</p>
	</form>
</body>
</html>