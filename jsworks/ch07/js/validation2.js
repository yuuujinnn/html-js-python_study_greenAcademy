//유효성 검사
function checkMember(){
    let form = document.regForm;
    let id = form.uid;
    let mail = form.email;
    let pw1 = form.pw1;
    let pw2 = form.pw2;

    let pw_pat1 = /[0-9]+/; // 숫자
    let pw_pat2 = /[a-zA-Z]+/; // 영문자
    let pw_pat3 = /[!@#%^&*+$]+/; // 특수문자

    console.log(pw1.value);
    console.log(pw_pat1.test(pw1.value));
    if(id.value.length < 4){
        alert("아이디는 4~15자까지 가능합니다.");
        id.select();
        return false;
    }else if(mail.value == ""){
        alert("이메일은 필수 입력항목입니다.");
        mail.focus();
        return false;
    }else if(pw1.value.length < 8 || !pw_pat1.test(pw1.value)
        || !pw_pat2.test(pw1.value) || !pw_pat3.test(pw1.value)){
        alert("비밀번호는 영문자, 숫자, 특수문자 포함 8자 이상입니다.");
        pw1.select();
        return false;
    }else if(pw1.value != pw2.value){
        alert("비밀번호는 동일해야 합니다.");
        pw2.select();
        return false;
    }else{
        form.submit();
    }
    console.log(pw1.value); //false
}