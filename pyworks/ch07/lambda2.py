# map(), filter()
# list() 함수로 리스트를 변환함
def times(x):
    return 3 * x

v = [1, 2, 3, 4]
# times = lambda x : 3 * x
result = map(times, v)  # map(함수, 리스트)
print(list(result))

# filter()와 lambda 사용
# 음의 정수를 출력하시오
def negative(n):
    return n < 0

li = [-5, 1, 2, -11, 76]
# negative = lambda x : x < 0
value = filter(negative, li)
print(list(value))