# match(), search() 객체의 메서드
# 그루핑(grouping())
# group(1) 1번째 그룹
import re

"""
p = re.compile('[a-z]+')
m = p.match('hello')

print(m.group())    # 문자열 출력
print(m.start())    # 시작 인덱스 - 0
print(m.end())      # 끝 인덱스 - 5(5-1)
print(m.span())     # 구간(시작, 끝)
"""

# 이름과 전화번호를 분리해서 추출하기
# () - 소괄호가 그룹, 번호로 구분 group(1)

str = "lee 010-1234-5678"
"""
pat = re.compile("(\w+)\s{1,2}(\d+[-]\d{4}[-]\d{4})")     # 공백이 1개나 2개
mat = pat.match(str)
print(mat)
print(mat.group())
print('이름:', mat.group(1))
print('전화번호:', mat.group(2))
"""

# 그루핑된 문자열에 이름 붙이기
# 정규 표현식 - (?P<그룹이름>)
pat2 = re.compile('(?P<name>\w+)\s{1,2}(?P<phone>\d+[-]\d{4}[-]\d{4})')
mat2 = pat2.match(str)
print('이름:', mat2.group('name'))
print('전화번호:', mat2.group('phone'))

# sub(\g<그룹이름>)
s1 = pat2.sub('\g<name>', 'park 010-3333-4444')
s2 = pat2.sub('\g<phone>', 'park 010-3333-4444')
print('이름:', s1)
print('전화번호:', s2)

# 문자열 바꾸기
data = """
    kim 871212-1234567
    lee 770707-2345678
"""
jumin = re.compile("(\d)+[-]\d+")
jumin2 = jumin.sub('\g<1>-*******', data)
print(jumin2)

# 전화번호 맨 끝자리 **** (마스크 처리)
phone = """
park 010-1234-5678
han 010-2345-6789
"""
phone2= re.compile("(\d+[-]\d{4})[-]\d{4}")
phone2 = phone2.sub('\g<1>-****', phone)
print(phone2)