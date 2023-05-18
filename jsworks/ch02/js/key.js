// 'y' or 'Y' 키를 누르면 "계속 반복합니다." 
// 'n' or 'N' 키를 누르면 "반복 중단합니다."
// 그 이외의 키는 "키를 잘못 눌렀습니다."

while(true){
    let key = prompt("계속 반복할까요?", "y/n");

    if(key == "y" || key == "Y"){
        alert("계속 반복합니다.");
    }
    else if(key == "n" || key == "N"){
        alert("반복 중단합니다.");
        break;
    }
    else{
        alert("키를 잘못 눌렀습니다.");
    }
}
document.write("프로그램 종료!!");