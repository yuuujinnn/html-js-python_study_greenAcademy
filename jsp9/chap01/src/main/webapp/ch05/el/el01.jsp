<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>문자, 숫자 데이터 표현</h3>
	${300}<br>
	${"감사합니다"}<br>
	${300 + "10"}
	
	<h3>산술 연산</h3>
	\${7 + 4} : ${7 + 4}<br>
	\${7 - 4} : ${7 - 4}<br>
	\${7 x 4} : ${7 * 4}<br>
	\${7 / 4} : ${7 / 4}<br>
</body>
</html>