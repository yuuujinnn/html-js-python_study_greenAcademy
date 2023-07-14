
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.LoginBean"%>
<%
	//폼에 입력된 자료 가져오기
	String uid = request.getParameter("userid");
    String pwd = request.getParameter("passwd");
    
    LoginBean login = new LoginBean();  //LoginBean 객체 생성
    login.setUserid(uid);  //아이디 입력
    login.setPasswd(pwd);  //비밀번호 입력
    
    boolean result = login.checkUser();
    if(result){
    	out.println(uid + "님 환영합니다.");
    }
    else{
    	out.println("아이디나 비밀번호를 확인해 주세요.");
    }
%>

<p>아이디: <%=login.getUserid() %></p>
<p>비밀번호: <%=login.getPasswd() %></p>