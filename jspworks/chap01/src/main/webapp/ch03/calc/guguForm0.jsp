<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
<script src="../../resources/js/guguCheck.js"></script>
</head>
<body>
	<form action="guguProcess.jsp" method="post" name="form1">
		<p>
			<label for="dan">단 </label>
			<input type="text" name="dan" id="dan">
		</p>
		<!-- <p><input type="submit" value="확인"></p> -->
		<p><input type="button" value="확인" onClick="guguCheck()"></p>
	</form>
</body>
</html>