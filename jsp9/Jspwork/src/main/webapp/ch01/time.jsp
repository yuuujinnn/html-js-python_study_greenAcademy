<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시간이란...</title>
<style>
	#content{width: 90%; margin: 20px auto; text-align: center;}
	h2{color: #00f;}
</style>
<script>
	//디지털 시계
	setInterval(myWatch, 1000);
	
	function myWatch(){
		let date = new Date();
		let now = date.toLocaleTimeString();
		document.getElementById("demo").innerHTML = now;
	}
</script>
</head>
<body>
    <div id="content">
		<h2>시간이란...</h2>
		<h3>내일 죽을 것처럼 오늘을 살고<br>
			영원히 살 것처럼 내일을 꿈꾸어라</h3>
		<img src="../resources/images/time.jpg" alt="손시계">
		<p id="demo"></p>
	</div>
</body>
</html>