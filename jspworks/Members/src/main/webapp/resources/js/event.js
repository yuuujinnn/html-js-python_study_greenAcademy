function play() {    
            let name = ['이진성', '노승우', '박성호', '권지혜', '김은효', '이경철', '성의석', '이유진', '유성길', '한주훈', 
                '강정현', '김현우', '이영준', '김민정', '유세현', '윤기은', '오화룡', '조은별', '이가은', '안재훈'];
            let numbers = new Array(5);  //랜덤 번호 5개를 저장할 배열 선언
        
            for(let i = 0; i < numbers.length; i++){
                let num = Math.floor(Math.random() * name.length); //랜덤 번호
                numbers[i] = num;      

                // 중복 제거
                for(let j = 0; j < i; j++){
                    if(numbers[j] == numbers[i]){
                        //console.log("중복 번호 : " + numbers[i])
                        i--;  //중복된 인덱스 삭제함
                    }
                }
            }
            // numbers = [1, 3, 5 , 11, 15]
            // document.getElementById("display").innerHTML = numbers;

            
            let winners = new Array(5); //당첨자 이름을 저장할 배열 선언
            for(let i=0; i<winners.length; i++) {
                winners[i] = name[numbers[i]]
            } 
            document.getElementById("display").innerHTML = winners;
            //winners = ['김', '이', '박']
            
    }