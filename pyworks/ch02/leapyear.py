# 연습문제
# 2월 29일 - 윤년, 4년마다 오고, 100년 단위는 아니나,
# 400년은 윤년이다.
# 조건1 - 4년마다 오고, # 조건2 - 100년 단위는 아님, # 조건3 - 400년 단위는 윤년임
# 1800, 1900년 - 평년, 1600, 2000년 - 윤년
# 출력 - f string 방식(format)
# 예외(오류) 처리 - try 실행 except 처리 구문

try:
    year = int(input("연도를 입력하세요 : "))

    if(year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        #print(str(year) + "년은 윤년입니다.")
        print(f'{year}년은 윤년입니다.')
    else:
        #print(str(year) + "년은 평년입니다.")
        print(f'{year}년은 평년입니다.')
except ValueError:
    print("숫자를 입력해 주세요")
