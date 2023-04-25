# Counter 클래스 만들기

class Counter:
    x = 0

    def __init__(self):
        Counter.x += 1  # 클래스변수이므로 클래스로 직접 접근

    def get_count(self):
        return self.x

c1 = Counter()
print(c1.get_count())  # 1

c2 = Counter()
print((c2.get_count()))  # 2

c3 = Counter()
print((c3.get_count()))  # 3

'''
class Counter:
    def __init__(self):
        self.x = 0
        self.x += 1  # x에 1증가

    def get_count(self):
        return self.x

c1 = Counter()  # 객체 생성
print(c1.get_count())  # 1

c2 = Counter()
print((c2.get_count()))
'''