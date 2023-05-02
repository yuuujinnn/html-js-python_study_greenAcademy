# 함수 - function, method(메서드)
'''
for i in range(1, 11):
    print(i)
'''
import time

# 1부터 n까지 출력하는 함수
def get_num(n):
    for i in range(1, n + 1):
        print(i, end=' ')

get_num(20) # 호출
print()
# 1부터 n까지의 합계를 구하는 함수

"""
start = time.time()
def get_sum(n):
    sum_v = 0
    for i in range(1, n + 1):
        sum_v += i
    return sum_v

print(f'합계 : {get_sum(10000000)}')
end = time.time()
print(f'소요 시간 : {end-start}초')
"""

# 계산 복잡도 - 곱셈, 덧셈, 나눗셈 - 3번 : 0(1)
start = time.time()
def get_sum2(n):
    sum_v = (n * (n+1)) // 2
    return sum_v

if __name__=="__main__":
    print(f'합계 : {get_sum2(10000000)}')
    end = time.time()
    print(f'소요 시간 : {end-start}초')

