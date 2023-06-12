//구구단 입력 유효성 검사
function guguCheck(){
	let form = document.form1;
	let dan = form.dan;
	
	if(dan.value == "" || isNaN(dan.value)){
		alert("숫자를 입력해 주세요");
		dan.focus();
		return false;
	}else if(dan.value < 1 || dan.value > 9){
		alert("1부터 9단까지 입력가능합니다.")
		dan.select();
		return false;
	}
	else{
		form.submit();
	}
}
