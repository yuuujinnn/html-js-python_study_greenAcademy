# 지나온 날짜 계산하기 : 일수 = 종료일 - 시작일
# datetime.date(종료일) - datetime.date(시작일)
# 요일(인덱스) - datetime.date(특정일).weekday(), 월-0번
import datetime
import calendar

print(" ♠ 지금까지 몇 일? ♠")
day1 = datetime.date(2023, 3, 16)
print(day1)

# today = datetime.date(2023, 4, 21)
today = datetime.date.today()
print(today)

passed_time = today - day1
#print(passed_time)
# 날짜객체.days -> 일로 환산
print("개강 이후 {}일이 지났습니다.".format(passed_time.days))

# 날짜로 요일 알아내기
days = ['월', '화', '수', '목', '금', '토', '일']

# datetime.date(2023, 3, 16).weekday()
the_day = datetime.date(2023, 3, 16).weekday()
print(the_day)
print(f'{days[the_day]}요일')

now = datetime.date.today().weekday()
print(f'{days[now]}요일')

# 2023. 3월 출력
calendar.prcal(2023)
calendar.prmonth(2023, 3)