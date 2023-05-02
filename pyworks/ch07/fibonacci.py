# 피보나치 수열 - 1 1 2 3 5 8....
# 첫째항 및 둘째항이 1이며, 그 뒤의 항은 바로 앞 두 항의 합임

def fibo(n):
    if n <= 2:  # 종료 조건
        return 1
    else:
        return fibo(n-2) + fibo(n-1)

    """
    n=1, fibo(1)  1
    n=2, fibo(2)  1
    n=3, fibo(3), fibo(1) + fibo(2), 2
    n=4, fibo(4), fibo(2) + fibo(3), 2
    """

print(fibo(1))  #1
print(fibo(2))  #1
print(fibo(3))  #2
print(fibo(4))  #3
print(fibo(5))  #5