# 두 수를 매개변수 전달 전달
# 1. 서로 같으면 곱하고,
# 2. 두 수가 서로 다르면 더하는 함수

def fn_multi(x, y):
    if x == y:
        return x + y
    else:
        return x + y

result1 = fn_multi(5, 5)
result2 = fn_multi(5, 10)

print(result1)
print(result2)


# 구구단 4단 출력
"""
dan = 4
for i in range(1, 10):
    print(f'{dan} x {i} = {dan * i}')
"""


# 함수를 정의해서 구구단 출력
def fn_gugu(dan):
    for i in range(1, 10):
        print(f'{dan} x {i} = {dan * i}')

fn_gugu(3)