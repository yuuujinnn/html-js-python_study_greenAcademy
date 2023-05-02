# 단위 변환기 클래스 정의
# 1inch -> 25mm

class ScaleConverter:
    def __init__(self, units_from, units_to, factor):
        self.units_from = units_from
        self.units_to = units_to
        self.factor = factor

    def convert(self, value):
        return value * self.factor

con = ScaleConverter("inches", "mm", 25)
print("Converting 2 inches")    # 2인치 변환하기
print(str(con.convert(2)) + con.units_to)    #50mm