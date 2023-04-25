# 입력 처리
"""
print("당신이 좋아하는 색깔은 무엇이에요?(흰색)")
color = input() #키보드 입력
print(color)
"""

"""
# '\n' - 줄바
color = input("당신이 좋아하는 색깔은 무엇이에요?(흰색)\n")
print("좋아하는 색깔은", color, "입니다")
"""

# int() - 문자를 정수로 바꿔줌
# str() - 숫자를 문자로 바꿔줌
# '+' - 숫자나 더하고 또는 문자를 연결할 때

number = int(input("숫자를 입력하세요 "))
print('입력된 수는 ', (number + 4), '입니다')
print('입력된 수는 ' + str(number + 4) + '입니다.')
