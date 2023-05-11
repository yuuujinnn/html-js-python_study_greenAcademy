# 입력 받아 파일 쓰기
# 'a' 모드 - 추가 저장 가능함

with open("./output/input.txt", 'a') as f:
    while True:
        text = input("저장할 내용을 입력해 주세요(종료-z) : ")
        if text == 'z' or text == 'Z':
            break
        f.write(text)
        f.write('\n')