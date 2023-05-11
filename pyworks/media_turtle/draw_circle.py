# 원 그리기
import turtle as t

t.bgcolor('black')
t.color('green')
t.speed(0)  # 1~10 숫자가 클수록 빠른데, 0이 가장 빠름
n = 50
for x in range(n):
    t.circle(80)
    t.left(8)


t.mainloop()
