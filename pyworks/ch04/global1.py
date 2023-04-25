# 지역 변수와 전역 변수
"""
def one_up():   #1을 더하는 함수
    x = 0       #지역 변수
    x = x + 1
    return x

print(one_up()) #1
print(one_up()) #1
"""

def one_up2():
    global x    #전역 변수임을 알려주는 키워드
    x = x + 1
    return x

# 전역 변수는 값을 공유 및 누적 저장,
# 프로그램 종료 시 메모리에서 소멸

x = 0
print(one_up2())    #1
print(one_up2())    #2
print(one_up2())    #3
print(x)