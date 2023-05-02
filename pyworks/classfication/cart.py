# Cart 클래스 정의
# 클래스 리스트
class Cart:
    li = []  # 클래스 리스트

    def add_cart(self, goods):  # 제품 추가
        Cart.li.append(goods)

cart1 = Cart()
cart1.add_cart("계란")
print(Cart.li)

cart2 = Cart()
cart2.add_cart("두부")
print(Cart.li)

cart3 = Cart()
cart3.add_cart("콩나물")
print(Cart.li)

# for문 출력
for i in Cart.li:
    print(i)