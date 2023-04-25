# 변수의 선언과 사용
# 어떤 학생의 이름과 학년과 반을 출력
# 변수 이름 작성 시 주의 - 숫자로 시작할 수 없음, 공백을 허용하지 않

name = '이하나'
#print(name)

grade = 2
#print(grade)

#class = 1
school_class = 1  #class는 예약어이므로 사용불가
#print(school_class)
print(name + " 학생은 " + str(grade) + "학년 " +
      str(school_class) + "반 입니다")

# 문자열에 따옴표 포함하기
say = "'힘내세요.' 라고 말했습니다."
print(say)
say2 = '"Python is very easy." he says.'
print(say2)

# 변수에 문자열을 여러 줄로 작성(저장)
song1 = '''
동해물과 백두산이 마르고 닳도록
하느님이 보우하사 우리나라 만세
'''

print(song1)

# 진수 표현하기
num = 10

#이진수 표기법(0b를 붙임)
b_num = 0b1010
print(b_num)

#16진수 표기법(0x를 붙임) - 0x32f12(메모리주소)
h_num = 0xA
print(h_num)

# 진수 표현 함수
print(bin(10)) #0b1010
print(bin(65))
print(hex(10)) #0x1010

#아스키 코드의 문자
print(chr(48)) #0
print(chr(65)) #A
