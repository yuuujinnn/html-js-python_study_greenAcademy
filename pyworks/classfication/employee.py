# 사번 자동 발급
# 보안 - 멤버 변수에 접근하지 않고, 함수를 작성

class Employee:
    serial_num = 1000   # 사번 기준값(클래스 변수)

    def __init__(self, name):
        # 기준값을 1 증가시킨 후 id에 저장함
        Employee.serial_num += 1
        self.id = Employee.serial_num
        self.name = name

    def __str__(self):
        return "사번 : {}, 이름 : {}".format(self.id, self.name)

emp1 = Employee("최사원")
# print(emp1.id)
print(emp1)

emp2 = Employee("유사원")
print(emp2)

emp3 = Employee("권사원")
print(emp3)

# 객체 리스트
employee = [
    Employee('구름'),
    Employee('별'),
    Employee('행성'),
    Employee('달')
]
# 전체 출력
for emp in employee:
    print(emp)