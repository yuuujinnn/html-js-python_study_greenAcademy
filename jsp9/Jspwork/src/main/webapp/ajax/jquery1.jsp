<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제이 쿼리 예제</title>
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(document).ready(function(){
		//alert("jquery testing...");
		$('h2').css('color', 'blue');
		$('.info').css('background', 'yellowgreen');
		$('.info').next('p').css('font-style', 'italic');
		//버튼 클릭
		$('button').click(function(){
			alert("안녕하세요~");
		})
	});
</script>
</head>
<body>
	<h2>환영합니다.</h2>
	<p class="info">내 이름은 김초엽입니다.</p>
	<p>나는 서울에 살아요</p>
	<button type="button">전송</button>
</body>
</html>