<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체크 박스 선택</title>
</head>
<body>
	<form action="process2.jsp" method="get">
		<p>
			<label>오렌지<input type="checkbox" name="fruit" value="오렌지" checked></label>
			<label>사과<input type="checkbox" name="fruit" value="사과"></label>
			<label>바나나<input type="checkbox" name="fruit" value="바나나"></label>
			<input type="submit" value="전송">
		</p>
	</form>
</body>
</html>