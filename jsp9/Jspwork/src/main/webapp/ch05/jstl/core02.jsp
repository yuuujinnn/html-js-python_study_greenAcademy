<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점 처리</title>
<script>
	//점수를 입력하지 않았거나, 문자인 경우 처리(name 속성으로 처리)
	function checkScore(){
		//alert("test");
		let form = document.form1;
		let score = form.score;

		if(score.value == "" || isNaN(score.value) 
				|| score.value.trim() == ''){
			alert("숫자를 입력해 주세요.");
			score.focus();
			return false;
		}else if(score.value < 0 || score.value > 100){
			alert("1~100까지 입력가능합니다.");
			score.select();
			return false;
		}else{
			form.submit();
		}
		
	}
</script>
</head>
<body>
	<h3>점수를 입력해 주세요</h3>
	<form action="scoreTest.jsp" method="get" name="form1">
		<p>점수: <input type="text" name="score">
		    <input type="button" value="학점출력" onclick="checkScore()">
		</p>
	</form>
</body>
</html>