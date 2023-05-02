# 바이너리 파일이란 화상, 음성, 이미지 등의 파일로
# 0과 1로 이루어진 파일이다.
# bin 확장자 파일 생성
with open("./output/data.bin", 'wb') as f:
    text = "바람이 분다."
    f.write(text.encode())  # encode() - 0과 1로 코드화함

# data.bin 읽기
with open("./output/data.bin", 'rb') as f:
    text = f.read()
    print(text)
    print(text.decode()) # 해독하여 원문으로 바꿈