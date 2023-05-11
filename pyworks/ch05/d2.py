# 2차원 리스트 - 3행 2열(표 형태로 인식)
# 입력(기억, 저장)
a = [
    [10, 20],
    [30, 40],
    [50, 60]
]

# 출력
print(a[0][0])  #10
print(a[0][1])  #20
print(a[1][0])  #30
print(a[1][1])  #40

# 2차원 리스트에 요소 추가 - 리스트를 추가함
a.append([70, 80])

# 전체 출력
for x, y in a:
    print(x, y)

#b = [1, 2, 3, 4]
#b.append(10)
#print(b)
#len(b)  #4

print("2차원 리스트 크기(행)", len(a))
print("2차원 리스트 크기(열)", len(a[0]))
print("2차원 리스트 크기(열)", len(a[1]))

# for ~ range()
for i in range(0, len(a)):  # len(a)=3, 3-1=2
    for j in range(0, len(a[i])):
        print(a[i][j], end=' ')
    print()

# 리스트의 연산(합계)
total = 0
count = 0  # 2차원 이상은 개수를 직접 카운트
for i in range(0, len(a)):  # len(a)=3, 3-1=2
    for j in range(0, len(a[i])):
        total += a[i][j]
        count += 1
        print(total, '=', total ,'+' ,a[i][j], )
    print()
"""
  i=0 j=0  0+10, total = 10,
      j=1  10+20, total = 30
  i=1 j=0  30+30, total = 60,
      j=1  60+40, total = 100
  i=2 j=0  100+50, total = 150,
      j=1  150+60, total = 210
  i=3 j=0  210+70, total = 280,
      j=1  280+80, total = 360
"""
# 평균 구하기
avg = total / count

print(f'합계 : {total}')
print(f'개수 : {count}')
print(f'평균 : {avg}')