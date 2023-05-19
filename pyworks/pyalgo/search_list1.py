# 순차 탐색
# 리스트의 첫번째 자료부터 하나씩 비교하면서 같은 값이 나오면
# 그 위치를 돌려주고(반환), 못찾으면 -1을 반환함

def search_list(a, x):  # 리스트, 찾는값
    n = len(v)
    for i in range(0, n):   # 모든 값을 차례로 반ㄴ복
        if a[i] == x:       # 리스트의 값이 찾는 값과 비교하여 같으면
            return i        # 위치를 반환함
    return -1

def search_list2(a, x):
    same_num = []   # 중복 위치를 저장할 리스트 생성
    n = len(a)
    for i in range(0, n):
        if a[i] == x:
            same_num.append(i)

    if x not in a:
        return -1
    else:
        return same_num


    # # 리스트에 찾는 값이 없으면
    # if len(same_num) == 0:
    #     # return -1
    #     return "값을 찾을 수 없습니다."
    # else:
    #     return same_num


v = [60, 5, 33, 12, 97, 24, 5]

# 매개변수 - 리스트, 찾는값
print(search_list(v, 5))  # 1
print(search_list(v, 12))  # 3
print(search_list(v, 100))  # 3

# 중복값 위치 찾기
print(search_list2(v, 5)) # [1, 6]
print(search_list2(v, 20)) # 값을 찾을 수 없습니다.



'''
n = len(v)

for i in range(0, n):
    if v[i] == 13:
        print("찾음")
    else:
        print("없음")
'''