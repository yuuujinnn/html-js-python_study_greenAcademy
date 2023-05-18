# 정렬방법 - 1. 내장함수, 2. 반복조건문
# 리스트의 메서드 sort(), reverse()
#반복 조건문(중첩 for)
# 오름정렬 알고리즘 - 버블정렬
a = [60, 5, 33, 12, 97, 24]
n = len(a)
for i in range(0, n):
    for j in range(0, n-1):
        if a[j] > a[j+1]:
            #교환(자리바꾸기)
            #a[j], a[j+1] = a[j+1], a[j]
            temp = a[j]
            a[j] = a[j+1]
            a[j+1] = temp
'''
i=0(1행) j=0 a[0] > a[1] True 5, 60, 33, 12, 97, 24
         j=1 a[1] > a[2] True 5, 33, 60, 12, 97, 24
         j=2 a[2] > a[3] True 5, 33, 12, 60, 97, 24
         j=3 a[3] > a[4] False 5, 33, 12, 60, 97, 24
         j=4 a[4] > a[5] True 5, 33, 12, 60, 24, 97
i=1(2행) j=1 a[1] > a[2] False 5, 33, 12, 60, 24, 97
         j=2 a[2] > a[3] True 5, 12, 33, 60, 24, 97
         j=3 a[3] > a[4] True 5, 12, 33, 24, 60, 97
         j=4 a[4] > a[5] False 5, 12, 33, 24, 60, 97
i=2(3행) j=2 a[2] > a[3] True 5, 12, 24, 33, 60, 97
'''
print(a)

"""
a.reverse() #거꾸로 배치
print(a)

a.sort()  # 오름차순
print(a)

a.sort(reverse=True) # 내림차순
print(a)
"""




