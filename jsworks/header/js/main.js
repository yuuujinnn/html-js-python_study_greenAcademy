
// let toggleBtn = document.querySelector(".navbar_toggleBtn");
// let menu = document.querySelector(".navbar_menu");

// toggleBtn.addEventListener('click', function(){
//     menu.classList.toggle('active');  //active 스타일 추가 및 삭제
// })

// 제이쿼리 구현
$(function(){
    // 메뉴바 클릭했을때 이벤트
    $(".navbar_toggleBtn").click(function(){
        $(".navbar_menu").toggle("active");
    });
    
    // 윈도우 크기를 조절하는 기능
    $(window).resize(function(){
        if(parseInt($('nav').css('width')) > 768){ //정수로 변환 크기 비교
            $('.navbar_menu').css('display', 'flex');
        }
    })

})