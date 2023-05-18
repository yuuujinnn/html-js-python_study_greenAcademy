# vaccine.py
birth_year = int(input("출생년도 입력 : "))
age = 2023 - birth_year + 1
#print(age)
if age >= 20 and age <= 65:
    print("백신 접종 대상")
    birth_year = str(birth_year) #문자열로 변환
    
    if birth_year[-1] == '1' or birth_year[-1] == '6':
        print("월요일 접종")
    elif birth_year[-1] == '2' or birth_year[-1] == '7':
        print("화요일 접종")
    elif birth_year[-1] == '3' or birth_year[-1] == '8':
        print("수요일 접종")
    elif birth_year[-1] == '4' or birth_year[-1] == '9':
        print("목요일 접종")
    else: 
        print("금요일 접종")
else:
    print("하반기 일정 확인")


