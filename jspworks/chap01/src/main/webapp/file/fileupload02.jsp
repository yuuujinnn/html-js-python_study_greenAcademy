<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="uploadProcess2.jsp" method="post"
	      enctype="multipart/form-data">
		<p>이 름1: <input type="text" name="name1">
		   제 목1: <input type="text" name="title1">
		   파일이름1: <input type="file" name="fileName1"></p>
		<p>이 름2: <input type="text" name="name2">
		   제 목2: <input type="text" name="title2">
		   파일이름2: <input type="file" name="fileName2"></p>
		<p>이 름3: <input type="text" name="name3">
		   제 목3: <input type="text" name="title3">
		   파일이름3: <input type="file" name="fileName3"></p>
		<p><input type="submit" value="파일올리기"></p>
	</form>
</body>
</html>