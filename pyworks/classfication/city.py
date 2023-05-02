
class City:
    a= ['Seoul', 'Incheon', 'Daejeon', 'Jeju']  # 클래스 리스트

str1 = ""
for i in City.a:    # 클래스 이름으로 직접 접근
    str1 += i[0]

print(str1)