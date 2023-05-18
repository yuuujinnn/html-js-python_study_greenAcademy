# 순차 탐색
# 학생 번호에 해당하는 이름을 순차 탐색으로 찾아
# 돌려주는 함수를 작성하세요(단, 학생번호가 없으면 '?'를 반환함)

def search_list(a, x):
    n = len(v)
    for i in range(0, n):
        if a[i] == x:
            return name[i]
    return '?'


v = [60, 5, 33, 12, 97, 12]
name = ['이순신', '강감찬', '서희', '안중근', '유관순']


# 매개변수 - 리스트, 찾는값
print(search_list(v, 5))  # 강감찬
print(search_list(v, 12)) # 안중근
print(search_list(v, 18)) # ?



'''
n = len(v)

for i in range(0, n):
    if v[i] == 13:
        print("찾음")
    else:
        print("없음")
'''