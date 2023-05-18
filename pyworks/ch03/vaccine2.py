# vaccine.py

try:
    birth_year = int(input("출생년도 입력 : "))
    age = 2023 - birth_year + 1
    #print(age)
    if age >= 20 and age <= 65:
        print("백신 접종 대상")
        if birth_year % 5 == 1:
            print("월요일 접종")
        elif birth_year % 5 == 2:
            print("화요일 접종")
        elif birth_year % 5 == 3:
            print("수요일 접종")
        elif birth_year % 5 == 4:
            print("목요일 접종")
        else:
            print("금요일 접종")
    else:
        print("하반기 일정 확인")
except:
    print("숫자를 입력해주세요")


