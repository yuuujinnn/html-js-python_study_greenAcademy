<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 태그</title>
</head>
<body>
	<h2>Scripting Tag</h2>
	<!-- 스크립트릿 태그 -->
	<%
		int num1 = 10, num2 = 11;
		int sum = 0;
		sum = num1 + num2;
		//out - 내장 객체
	    out.println("합계: " + sum + "<br>");
	
	    //1부터 10까지 출력
	    for(int i=1; i<=10; i++){
	    	out.println(i);
	    }
	    
	    out.println("<br>"); //줄바꿈
	
	    //1~ 10중 짝수 출력
	    for(int i=1; i<=10; i++){
	    	if(i % 2 == 0)
	    		out.println(i);
	    }  
	%>
</body>
</html>