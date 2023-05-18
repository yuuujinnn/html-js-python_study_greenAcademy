# Customer 클래스 생성
# 멤버 변수 - 고객 아이디, 이름, 등급, 보너스 포인트, 보너스 적립율
# 멤버 함수 - get(), set() 함수로
class Customer:
    def __init__(self, cid, cname):
        self.cid = cid
        self.cname = cname
        self.cgrade = "SILVER"
        self.bonus_point = 0
        self.bonus_ratio = 0.01     # 1%

    def __str__(self):
        return f'{self.cname}님의 등급은 {self.cgrade}이고, '\
               f'보너스 포인트는 {self.bonus_point}점 입니다.'

    def calc_price(self, price):
        # self.bonus_point = price * self.bonus_ratio
        # 보너스 포인트 += 보너스 포인트
        self.bonus_point += int(price * self.bonus_ratio)
        return price

    def getname(self):  # 이름을 가져오는 함수
        return self.cname

    def __str__(self):
        return f'{self.cname}님의 등급은 {self.cgrade}이고,' \
               f'보너스 포인트는 {self.bonus_point} 입니다.'


c1 = Customer(1001, "정국")
# print(c1.cid, c1.cname)   # 멤버 변수에 직접 접근하지 않음
price = 10000
cost1 = c1.calc_price(price)
print(f'{c1.getname()}님의 구매 비용은 {cost1}원 입니다.')
print(c1)

c2 = Customer(1002, "슈가")
price = 20000
# print(c2.cid, c2.name)
cost2 = c2.calc_price(price)
print(f'{c2.getname()}님의 구매 비용은 {cost2}원 입니다.')
print(c2)
