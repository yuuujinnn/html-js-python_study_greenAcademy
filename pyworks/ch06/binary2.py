# 이미지 파일 읽고 쓰기
# 읽기 - open(파일경로, 'rb')
with open("./coffee-blue.jpg", "rb") as f1:
    img = f1.read()

# 쓰기 - open(파일경로, 'wb')
with open("./output/coffee-blue.jpg", "wb") as f2:
    f2.write(img)