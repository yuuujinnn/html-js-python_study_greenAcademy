# 재귀 함수
# 종료 조건을 항상 명시(if ~ else)
# 1부터 5까지 곱하기
def getgob(n):
    gob = 1  # 곱셈에서는 1을 기억
    for i in range(1, 6):
        gob *= i
        #print(i, gob)
    return gob

# 재귀함수
# 5*4(5-1)*3(4-1)*2(3-1)*1(2-1) = 5!(팩토리알, 계승)
# 패턴을 코드화
"""
def func(입력 값):
    if 입력값이 충분히 작으면: #종료 조건 
        return 결과값
    else:   #입력값보다 더 작은 값으로 호출
        return 결과값
"""

def facto(n):
    if n <= 1:  # facto(1) = 1
        return 1
    else:
        return n * facto(n-1)
    """
    n=5, 5 * facto(4)
    n=4, 5 * 4 * facto(3)
    n=2, 5 * 4 * 3 * facto(2)
    n=1, 5 * 4 * 3 * 2 * facto(1)
    """
# getgob() 호출
print(getgob(5))


def sos(n):
    print("Help me!")
    #종료 조건
    if n == 1:
        return ""
    else:
        return sos(n-1)
    """
    n=3,  help me!,  sos(2)
    n=2,  help me! help me!,  sos(1)
    n=1,  help me! help me! help me! 
    """

#sos(5)