<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정규 표현식</title>
<script type="text/javascript">
   function checkMember() {
      let form = document.member;
      let id = form.id.value;
      let pw = form.passwd.value;
      let name = form.uname.value;
      let phone = form.phone1.value
      + "-" + form.phone2.value 
      + "-" + form.phone3.value;
      
      // 정규 표현식
      let regExp = /^[a-zA-Z가-힣]/; // 아이디 - 문자로 시작
      let regExpPasswd = /^[0-9]+$/; // 비밀번호 - 숫자만
      let regExpName = /^[가-힣]+$/; // 이름 - 한글만
      let regExpPhone = /\d{3}-\d{3,4}-\d{3,4}/;
      
      if(!regExp.test(id)){
         alert("아이디는 문자로 해주세요");
         form.id.focus();
         return false;
      }else if (pw == "" || !regExpPasswd.test(pw)) {
         alert("비밀번호는 숫자만 입력해주세요");
         form.pw.focus();
         return false;
      }else if (name == "" || !regExpName.test(name)) {
         alert("이름은 한글만 사용가능 합니다.");
         form.uname.focus();
         return false;
      }else if (!regExpPhone.test(phone)) {
         alert("연락처를 확인해 주세요!!");
         form.phone2.select();
         return false;
      }else{
         form.submit();      
      }
      
   }
</script>
</head>
<body>
   <h3>회원가입</h3>
   <form action="validation_process.jsp" method="post" name="member">
      <p>
         <label for="id">아이디 </label> 
         <input type="text" name="id">
      </p>
      <p>
         <label for="passwd">비밀번호 </label> 
         <input type="password" name="passwd">
      </p>
      <p>
         <label for="uname">이름 </label> 
         <input type="text" name="uname">
      </p>
      <p>
         <select name="phone1">
            <option>010</option>
            <option>02</option>
            <option>031</option>
            <option>041</option>
         </select> 
         - <input type="text" name="phone2" maxlength=4 size=4> 
         - <input type="text" name="phone3" maxlength=4 size=4>
      </p>
      <p>
         <input type="button" value="가입하기" onclick="checkMember()"> 
         <input type="reset" value="다시쓰기">   
      </p>
   </form>
</body>
</html>