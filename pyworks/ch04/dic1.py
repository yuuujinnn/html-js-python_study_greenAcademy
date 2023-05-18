# 딕셔너리 자료형
# 딕셔너리 이름이 d - 이름(속성-key) - 나이(값-value)
d = {'진': 31, '슈가': 29}
print(d)
print(d['진'])

# 요소 추가
d['지민'] = 28

# 요소 삭제
d.pop('진')

print(d)

# 전체 출력
for key in d:
    print(key, ":", d[key])