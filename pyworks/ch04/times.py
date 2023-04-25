# 배수를 구하는 함수를 정의하고 사용
# 배수의 개수 구하기

def times(x):
    global count
    for i in range(1, 101):
        if i % x == 0:
            count += 1
            print(i, end=' ')

count = 0
times(3)
print(f'\n배수의 개수 : {count}')