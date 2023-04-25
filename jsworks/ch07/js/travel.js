//아이템 리스트
let itemList = []

let addBtn = document.getElementById("add");
addBtn.addEventListener("click", addList);

//아이템 추가 함수
function addList(){
    //item은 itemList에 push()로 저장(입력)
   let item = document.getElementById("item").value;
   itemList.push(item);
   document.getElementById("item").value = ""; //기존 아이템 내용 초기화
   document.getElementById("item").focus(); //커서의 위치

   showList();
} //addList 닫기

function showList(){
    //document.getElementById("itemList").innerHTML = itemList[0];
    let list = "<ul>";  //목록 리스트 변수
    for(let i=0; i<itemList.length; i++){
        //아이템 배열 출력
        //document.getElementById("itemList").innerHTML = itemList[i];
        list += "<li>"+ itemList[i] +"<span class='close' id=" + i + ">X</span></li>"
    }
    list += "</ul>"
    document.getElementById("itemList").innerHTML = list;

    //아이템 삭제
    //'X'를 선택
    let removeList = document.querySelectorAll(".close");

    //'X'를 클릭했을때 삭제 이벤트가 발생함
    for(let i=0; i<removeList.length; i++){
        removeList[i].addEventListener("click", remove);
    }

    function remove(){
        console.log(this);  //클릭 이벤트가 일어난 대상
        let id = this.getAttribute("id"); //id 값 가져옴
        itemList.splice(id, 1);  //해당 위치에서 1개 삭제

        //목록 보기
        showList();
    } //remove 닫기
}//showList 닫기