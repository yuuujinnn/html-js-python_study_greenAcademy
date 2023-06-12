<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
	<h2>파일 업로드</h2>
	<!-- enctype="multipart/form-data"를 반드시 명시함  -->
	<form action="fileupload01_process.jsp" method="post"
		  enctype="multipart/form-data">
		<p>이 름(유저): <input type="text" name="name"></p>
		<p>파일 제목: <input type="text" name="title">
		<p>파일 이름: <input type="file" name="fileName">
		<p><input type="submit" value="파일올리기"></p>
	</form>
</body>
</html>