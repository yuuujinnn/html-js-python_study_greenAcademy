from classfication.calculator2 import Calculator

class MoreCalculator(Calculator):
    # 2x2x2x2
    def pow(self):
        num = 1
        for i in range(0, self.y):
            num = num * self.x
        return num

    """
    def pow(self):
        return self.x ** self.y
    """

    def div(self):
        """
        if self.y == 0:
            return 0    # 0으로 종료
        else:
            return self.x / self.y
        """

        try:
            return self.x / self.y
        except ZeroDivisionError:
            print("0으로 나눌 수 없습니다.")
            # return e

cal1 = MoreCalculator(2, 4)
print(cal1.add())
print(cal1.sub())
print(cal1.mul())
print(cal1.div())
print(cal1.pow())

cal2 = MoreCalculator(5, 0)
print(cal2.add())
print(cal2.sub())
print(cal2.mul())
print(cal2.div())
print(cal2.pow())