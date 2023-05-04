import re

# findall(정규식, 문자열) - 문자열을 검색 : 결과를 리스트로 반환
# re.IGNORECASE - 대소문자 허용

str = "Two is too"
m1 = re.findall("T[wo]o", str)  # [wo] - 'w' or 'o'와 일치
print(m1)   #['Two']

m2 = re.findall("T[wo]o", str, re.IGNORECASE)
print(m2)

m3 = re.findall("T[^w]o", str, re.IGNORECASE)   # [^w] - 'w'가 아닌 문자
print(m3)