# 좌표 이동 - goto(x, y)
import turtle as t
import time
import random

t.shape('turtle')
"""
t.up()
time.sleep(1)  # 1초 대기
t.goto(0, 150)
time.sleep(1)
t.goto(100, 150)
time.sleep(1)
t.goto(0, 0)
"""
# 실행 시 랜덤하게 보임
"""
x = random.randint(-250, 250)
y = random.randint(-250, 250)
t.up()
t.goto(x, y)
"""
# 마음대로 걷는 거북이
t.speed(10)
for x in range(300):
    ang = random.randint(1, 360)  # 랜덤한 각도 저장
    t.setheading(ang)  # 머리 방향이 바뀜
    t.forward(10)

t.mainloop()