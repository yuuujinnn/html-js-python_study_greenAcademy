// 회원가입 유효성 검사
function checkMember() {
    let form = document.regForm;
    let id = form.memberid;
    let pw1 = form.passwd1;
    let pw2 = form.passwd2;
    let name = form.name;

    let pw_pat1 = /[0-9]+/      // 숫자 표현식
    let pw_pat2 = /[a-zA-Z]/    // 영어 대.소문자 표현식
    let pw_pat3 = /[~!@#$%^&*()_+]+/    // 특수문자

    if(id.value.length < 4 || id.value.length > 15) {
        alert("아이디는 4~15자까지 입력 가능합니다.");
        id.select()
        return false;
    }else if(pw1.value.length < 8 || !pw_pat1.test(pw1.value) ||
             !pw_pat2.test(pw1.value) || !pw_pat3.test(pw1.value)) {
        alert("비밀번호는 영문자/숫자/특수문자 포함 8자 이상 입력해주세요.")
        pw1.select();
        return false;
    }else if(pw1.value != pw2.value) {
        alert("비밀번호가 일치하지 않습니다.")
        pw2.select();
        return false;
    }else if(name.value == "") {
        alert("이름은 필수 입력 항목 입니다.")
        name.focus();
        return false;
    }else {
        form.submit();  // 폼 전송 - db에 저장
    }

}