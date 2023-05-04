import re
"""
str = "123?45yy7890 hi 999 hello"

# compile() : byte로 바꿈
# compile() 후 findall() 하면 검색할 내용이 많은 겨우 속도가 빠름

# pat = re.compile('\d{1,3}')   # 숫자 0~9에서 1~3개까지 찾음(매칭)
# m = re.findall(pat, str)

m = re.findall('\d{1,3}', str)
print(m)

m2 = re.findall('[1-5]{1,2}', str)
print(m2)
"""

# '*', '+'의 차이
p = re.compile('ca*t')  # 앞 문자가 0번 이상 반복
m1 = re.findall(p, 'caat')
print(m1)
m2 = re.findall(p, 'ct')
print(m2)

p2 = re.compile('ca+t')  # 앞 문자가 1번 이상 반복
m3 = re.findall(p2, 'caat')
print(m3)
m4 = re.findall(p2, 'ct')
print(m4)

# 점(.)은 임의의 문자 - 소괄호는 서브클래스(그룹)
str = "abcd<hr>Thank you"
pat1 = re.compile("<(.*)>") # 태그 미포함
m1 = re.findall(pat1, str)
print(m1)

pat2 = re.compile("(<.*>)") # 태그 포함
m2 = re.findall(pat2, str)
print(m2)