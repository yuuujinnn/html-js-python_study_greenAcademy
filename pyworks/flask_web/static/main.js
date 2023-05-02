let pic = document.getElementById('pic')
pic.onmouseover = changePic;    //changePic() 함수 호출
pic.onmouseout = originPic;

function changePic(){
pic.src = "../static/coffee-gray.jpg";
}

function originPic(){
pic.src = "../static/coffee-blue.jpg";
}