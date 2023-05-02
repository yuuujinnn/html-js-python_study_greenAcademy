# 예외 처리 미루기 - raise
# 구현하는 쪽에서 예외 처리를 하도록 강제함
# 클래스와 상속
class Animal:
    def breathe(self):
        print("동물이 숨울 쉰다")

    # 반드시 구현해야 되는 메서드
    def cry(self):
        raise NotImplementedError

class Dog(Animal):
    def cry(self):
        print("멍~ 멍~")

    def sleep(self):
        print("잠을 잔다")

class Cat(Animal):
    def cry(self):
        print("야~옹! 야~옹!")

dog = Dog()
dog.breathe()
dog.cry()

cat = Cat()
cat.breathe()
cat.cry()