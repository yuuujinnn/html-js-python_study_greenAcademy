<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 객체 예제</title>
</head>
<body>
	<form action="process.jsp" method="get">
	    <p>
			<label for="uname">이름 </label>
			<input type="text" id="uname" name="uname">
		</p>
		<p><button type="submit">등록</button></p>
	</form>
</body>
</html>