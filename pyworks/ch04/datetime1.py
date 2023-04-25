# 날짜 및 시간 모듈 포함하기
import datetime

now = datetime.datetime.today()
print(now)
print(now.strftime("%Y.%m.%d. %H.%M.%S"))

# 날짜 - 년, 월, 일
print(f'{now.year}년')
print(f'{now.month}월')
print(f'{now.day}일')

# 시간 - 시, 분, 초
print(f'{now.hour}시')
print(f'{now.minute}분')
print(f'{now.second}초')

# 오늘의 날짜
today = datetime.date.today()
print(today)

# 특정한 날짜
the_day = datetime.date(2022, 12, 12)
print(the_day)