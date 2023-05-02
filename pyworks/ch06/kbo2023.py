# f = open() -> with open()
# 파일 입출력 - .txt -> 문자형 데이터 저장
"""
f = open('./output/string.txt', 'w')

f.write("여름이 온다\n")
f.write('123\n')
val = (12 * 1000) / 5
f.write(str(val))

f.close()
"""

# kbo 팀 파일에 기록
try:
    team = ['롯데', '삼성', 'KIA', 'LG', '두산',
            '한화', 'SSG', '키움', 'NC', 'KT']
    with open('./output/kbo2023.txt', 'w') as f:
        for i in team:
            if i == team[-1]:
                f.write(i)
            else:
                f.write(i + ', ')
except:
    print("파일을 쓸 수 없습니다.")


# kbo2023.txt 읽기
try:
    with open('./output/kbo2023.txt', 'r') as f:
        team = f.read()
        print(team)
except FileNotFoundError as e:
    print(e)
    print("파일을 쓸 수 없습니다.")