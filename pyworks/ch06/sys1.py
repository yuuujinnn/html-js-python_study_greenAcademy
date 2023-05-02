# sys 모듈 - system
# 명령 프롬프트(명령 행에서 인수 사용하기)
import sys

"""
# print(sys.argv)
# print(sys.argv[1:])   # 1번 인덱스부터 추출(슬라이싱)
"""

# 명령형 입력값 연산
args = sys.argv[1:]  # arg 리스트 생성
print(args)

total = 0
for i in args:
    total += int(i)     # 입력 받은 문자를 숫자형으로 변환해야 함

print("합계 : ", total)