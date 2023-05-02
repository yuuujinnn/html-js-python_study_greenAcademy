# Counter 클래스 만들기

class Counter:
    x = 0   # 클래스 변수

    def __init__(self):
        Counter.x += 1  # 클래스 변수이므로 클래스로 직접 접근

    def get_count(self):
        return Counter.x

c1 = Counter()
print(c1.get_count())   #1

c2 = Counter()
print(c2.get_count())   #2

"""
class Counter:
    def __init__(self):
        self.x = 0      # 인스턴스 변수
        self.x += 1     # x에 1 증가
"""


c1 = Counter()  # 객체 생성
print(c1.get_count())   #1

c2 = Counter()
print(c2.get_count())   #1