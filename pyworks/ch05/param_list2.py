# 리스트의 최대값을 구하는 함수
def get_max(a):
    max_v = a[0]    # 리스트의 첫번째 값을 최대값으로 설정
    for i in v:
        if max_v < i:
            max_v = i
        return max_v

# 리스트의 최대값의 위치 구하는 함수
def get_max_idx(a):
    max_idx = a[0]  # 첫번째 값을 최대값의 위치로 설정
    n = len(a)
    for i in range(1, 5):
        if a[max_idx] < a[i]:   # 최대값으로 비교
            max_idx = i         # 인덱스를 저장
    return max_idx  #for문 종료 시 return
"""
    max_idx=0,  i=1,  a[0] < a[1],  3 < 2 False
                i=2,  a[0] < a[2],  3 < 2 True
    max_idx=2,  i=3,  a[0] < a[3],  5 < 1 False
                i=4,  a[0] < a[4],  5 < 4 False
"""
v = [3, 2, 5, 1, 4]
print("리스트의 개수 : ", len(v))
print("최대값 : ", get_max(v))
print("최대값의 위치 : ", get_max_idx(v))