# 함수 - 입력기능(매개변수를 통해서)
# 사각형의 넓이 계산 함수, 넓이 = 가로의 길이 x 세로의 길이
# 삼각형의 넓이 , 넓이 = (밑변 x 높이) / 2
# 함수이름 - calc_area(), tri_area()
def calc_area(w, h):
    area = w * h
    return area

def tri_area(s, h):
    area = s * h / 2
    return area

# 가로 - 4cm, 세로 - 3cm
result = calc_area(4, 3)
print('사각형의 면적:', result)   #12
print(f'사각형의 면적: {result}') #12

#삼각형. 밑변 - 4, 높이 - 5
result2 = tri_area(4, 5)
print('삼각형의 면적:', result2)   #12
print(f'삼각형의 면적: {result2}') #12

# 정사각형의 면적
"""
size = int(input("숫자를 입력: "))
area = size * size
print(area)
"""

def calc_size(n):
    area = n * n
    return area

print(calc_size(100))









