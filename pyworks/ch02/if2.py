# 다중 조건문 - if ~ elif ~ else
# 놀이공원 입장료 계산
# 8세미만 - 미취학아동, 14미만 - 초등학생, 20세미만 - 중.고등 , 20이상 -일반인
print("♣ 놀이 공원 입장료 계산 ♣")
age = int(input("나이를 입력하세요 : "))

if age >= 1 and age < 8:
    print("미취학 아동입니다.")
    charge = 1000
elif age >= 8 and age < 14:
    print("초등학생 입니다.")
    charge = 2000
elif age >= 14 and age < 20:
    print("중.고등학생 입니다.")
    charge = 2500
else:
    print("일반인 입니다.")
    charge = 3000

# 메인 영역
print("입장료는 " + str(charge) + "원 입니다.")
