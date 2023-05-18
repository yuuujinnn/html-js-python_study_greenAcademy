# GlodCustomer 클래스 생성
# 멤버 변수 - 고객아이디, 이름, 고객등급, 구매할인율, 보너스 적립율
from classfication.customer import Customer


class GoldCustomer(Customer):
    def __init__(self, cid, cname):
        super().__init__(cid, cname)
        self.cgrade = "GOLD"
        self.sale_ratio = 0.1  # 10%
        self.bonus_point = 0
        self.bonus_ratio = 0.02  # 2%

    def calc_price(self, price):
        # price = price * sale_ratio (가격 = 가격 * 구매할인율)
        price -= int(price * self.sale_ratio)
        self.bonus_point += int(price * self.bonus_ratio)
        return price

g1 = GoldCustomer(1003, "뷔")
price = 10000
cost = g1.calc_price(price)
print(f'{g1.cname}님의 구매비용은 {cost}원입니다.')
print(g1)