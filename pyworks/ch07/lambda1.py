# lambda 함수 - 익명함수(anonymous function)
# lambda 매개변수 : 표현식(계산식)

def sub(x, y):
    return x - y

print(sub(3, 4))

# 람다식으로 표기
sub = lambda x, y : x - y
print(sub(3, 4))

# 매개변수 1개, 4의 배수
times = lambda x : 4 * x
print(times(5))
print((lambda x : 4 * x)(5))

# 제곱수 - 3*3 = 9
square = lambda a : a * a
print(square(10))
print((lambda a : a * a)(10))

# 람다 함수를 매개 변수로 이용
def call_10(func):
    for i in range(10):
        func()  # func() 함수 호출

def hello():
    print("안녕")

# call_10(hello)  # hello() 함수가 매개로 전달

# 매개변수가 없는 lambda
hello2 = lambda : print("안녕")
call_10(hello2)