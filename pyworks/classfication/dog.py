# Dog 클래스 - 정적 클래스
class Dog:
    kind = "진돗개"    # 클래스 변수

    def __init__(self, name):
        self.name = name  # 인스턴스 변수

dog1 = Dog("백구")
print(dog1.name)
#print(dog1.kind)
print(Dog.kind)   # 클래스 이름으로 직접 접근

dog2 = Dog("검둥이")
print(dog2.name)
#print(dog2.kind)
print(Dog.kind)