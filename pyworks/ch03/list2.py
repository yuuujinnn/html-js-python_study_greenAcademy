# 문자열 - 1차원 리스트
ss = "20230419Sunny"

#year = ss[0:4]
year = ss[:4]
print(year)

# day = 월일
day = ss[4:8]
print(day)

weather = ss[8:]
print(weather)

ss2 = year + day + weather
print(ss2)

# 문자열 관련 함수
# split(구분기호) -> 문자열이 리스트로 변환
# 문자열.split()
fruit = "banana, apple, strawberry"
fruitlist = fruit.split(',')
print(fruitlist)
print(fruitlist[1]) # 1번 인덱스 -> apple

# replace('이전문자', '새문자')
str1 = 'Hello, World'
str1 = str1.replace('World', 'Korea')
print(str1)

# 문자열.format()
name = "Mario"
year = 40
str2 = "My name is {0}. I am {1} years old.".format(name, year)
#str3 = "My name is %s." % 'Mario'
#name = "Mario"
#str4 = f"My name is {name}"
print(str2)
#print(str3)
#print(str4)

# split() 예제 - ':'로 구분하고 리스트로 변경
"""
string = "a:b:c:d"
string2 = string.split(':')
print(string2)
print(string2[-1])
"""

# 두 수를 동시에 입력 받아서 더하기
"""
n1, n2 = input("두 수 입력 : ").split() #공백으로 구분

add = int(n1) + int(n2)
print(add)
"""

# find() - 문자열이 존재하는 위치 반환
"""
text = "Hello"
print(text.find('H'))   #0
print(text.find('ll'))  #2
print(text.find('k'))   #-1

print(text.find('Hello')) #0
"""

# 회원 정보 출력하기
name = input("이름 : ")
user_id = input("아이디 : ")
user_pw = input("비밀번호 : ")
id_card1 = input("주민번호 앞자리 입력 : ")
id_card2 = input("주민번호 뒷자리 입력 : ")
print('=' * 30)

print("이름 : {}".format(name))
print("아이디 : {}".format(user_id))
user_pw = '*' * len(user_pw)
print("비밀번호 : {}".format(user_pw))
id_card2 = id_card2[0] + ('*' * 6)
print("주민등록번호 : {0}-{1}".format(id_card1, id_card2))




















