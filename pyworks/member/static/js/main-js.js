window.onload = function(){
    // 디지털 시계
    setInterval(setWatch, 1000);

    function setWatch(){
        let date = new Date()
        let now = date.toLocaleTimeString();  // 시간 형식
        document.getElementById('demo').innerHTML = now
    }

    //배경 이미지 슬라이딩
    //경로 주의 - static 폴더에서 시작함
    let picture = [
        "../static/images/header1.jpg",
        "../static/images/header2.jpg",
        "../static/images/header3.jpg"
    ]

    let imgIdx = 0;

    showPicture();   //showPicture() 함수 호출

    function showPicture(){
       let img = document.getElementById('pic');
       img.src = picture[imgIdx]  // 첫 이미지 저장
       imgIdx++;

       if(imgIdx == picture.length){ //imgIdx == 3
          imgIdx = 0;
       }

       //1초 간격으로 showPicture() 호출
       setTimeout(showPicture, 3000);
    }
}