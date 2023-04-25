# 출생년도 입력
"""
birth_year = input("출생년도 입력 : ")
"""

# 나이 계산
"""
age = 2023 - int(birth_year) + 1
"""

# 연산 및 출력
"""
if age >= 20 and age <= 65:
    print("백신 접종 대상")
    # 접종대상 - 출생년도 끝자리 비교
    # if ~ elif ~ else
    if birth_year[-1] == "1" or birth_year[-1] == "6":
        print("월요일 접종")
    elif birth_year[-1] == "2" or birth_year[-1] == "7":
        print("화요일 접종")
    elif birth_year[-1] == "3" or birth_year[-1] == "8":
        print("수요일 접종")
    elif birth_year[-1] == "4" or birth_year[-1] == "9":
        print("목요일 접종")
    elif birth_year[-1] == "5" or birth_year[-1] == "10":
        print("금요일 접종")
else:
    print("하반기 일정 확인")
"""




birth_year = input("출생년도 입력 : ")
age = 2023 - int(birth_year) + 1
print(age)
if age >= 20 and age <= 65:
    print("백신 접종 대상")
    # 접종대상 - 출생년도 끝자리 비교
    # if ~ elif ~ else
else:
    print("하반기 일정 확인")
