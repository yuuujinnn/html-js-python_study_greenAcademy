<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>search() 예제</title>
</head>
<body>
	<h2>The search() Method</h2>
	<p>search()는 정확히 일치하는 문자열의 위치(인덱스)를 반환한다</p>
	<p id="demo"></p>
	
	<script>
		let text = "Mr. Blue has a blue house.";
		//let position = text.search(/blue/);  /정규표현식/
		//let position = text.search(/blue/i);  //i-ignorecase: 대소문자 허용
		let position = text.search(/red/);  //-1 : 찾지 못함
		
		document.getElementById("demo").innerHTML = position;
	</script> 
</body>
</html>