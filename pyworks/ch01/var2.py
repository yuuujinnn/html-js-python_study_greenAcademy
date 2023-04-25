# 변수 선언, 대입 연산자
# 변수 값 바꾸기
# 파란색 컵 1이 있고, 빨간색 컵 2가 있을 때 두 값을 바꾸기
blue = 1
red = 2
print("blue =", blue, "red=", red)

#교환 처리
'''
yellow = blue   #yellow = 1
blue = red      #blue = 2
red = yellow
'''

#파이썬 직접 교환
blue, red = red, blue

print("blue =", blue, "red =", red)
print() #한줄 공백
print('=' * 20) # 20번 출력
print('***회원가입***')
userid = 'hangul'
userpw = 'han1234'
name = '한글'
phone = '010-1234-5678'
age = 35

print("아이디 :", userid)
print("비밀번호 :", userpw)
print("이름 :", name)
print("전화번호 :", phone)
print("나이 :", age)
#나이 : +연산자 사용 출력
print("나이 :", str(age))
