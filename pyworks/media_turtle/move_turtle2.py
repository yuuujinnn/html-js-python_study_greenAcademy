# turtle 모듈
import turtle as t

t.shape("turtle")
t.bgcolor("greenyellow")

n = 4  #변의 개수
d = 100 #거리(크기)
# 각도 = 360 / 변의 개수

for i in range(n):
    t.forward(d)
    t.right(360/n)

n = 3
for i in range(n):
    t.forward(d)
    t.right(360 / n)


t.mainloop()