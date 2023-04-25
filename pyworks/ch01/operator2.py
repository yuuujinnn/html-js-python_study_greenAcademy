# 비교 연산자 - 결과 True/False
# 논리 연산자 - 비교연산이 2번 이상 사용하면 - 결과 True/False

x = 10
y = -10

print(x > 0) #True
print(y > 0) #False
print()

print(x > y) #True
print(x < y) #False
print()

print(x == 10) #True
print(x == y) #False
print(x != y) #True
print()

# 논리 연산자 - 비교연산이 2번 이상 사용하면 - 결과 True/False
# and, or, not (&&, ||, !은 사용 불가)
print(x > 0 and y > 0) #False
print(x > 0 or y > 0) #True
print(not y > 0) #True
print()

#문자열 더하기, 곱하기
head = "Python"
tail = " is fun"
print(head + tail)

str = '안녕'
print(str * 3)

# 이스케이프 문자
# 줄바꿈 - '\n', 탭 - '\t'
table = """
이름\t나이\t지역
을지문덕\t40\t개성
세종대왕\t50\t서울
"""

print(table)

say = "'힘내세요!!' \n라고 말했습니다."
print(say)
