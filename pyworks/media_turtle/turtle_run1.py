# turtle run 게임
import turtle as t
import random

# 적 거북이 생성
te = t.Turtle()
te.shape('turtle')
te.color('red')
te.speed(0)
te.up()
te.goto(0, 200)

# 먹이 생성
tf = t.Turtle()
tf.shape('circle')
tf.color('green')
tf.speed(0)
tf.up()
tf.goto(0, -200)

def turn_right():
    t.setheading(0)

def turn_up():
    t.setheading(90)

def turn_left():
    t.setheading(180)

def turn_down():
    t.setheading(270)

def play():
    # 적 거북이와 닿지 않으면 게임 유지
    # 적 거북이와 닿으면 게임 멈춤
    if t.distance(te) > 12:
        t.ontimer(play, 100)    #0.1초 간격으로 계속 play 호출

    t.forward(10)
    te.forward(9)

    # 적거북이가 주인공 거북이의 위치를 쫓아옴
    # 방향을 알아채는데 20% 확률로 적용
    if random.randint(1, 5) == 4:
        ang = te.towards(t.pos())
        te.setheading(ang)

    # 주인공 거북이가 먹이에 닿으면 새 위치에서 랜덤하게 나타남
    if t.distance(tf) < 12:
        x = random.randint(-230, 230)
        y = random.randint(-230, 230)
        tf.goto(x, y)

# 주인공 거북이
t.shape('turtle')
t.setup(500, 500) #width, height
t.bgcolor('orange')
t.color('white')
t.speed(0)
t.up()

t.onkeypress(turn_right, "Right")
t.onkeypress(turn_up, "Up")
t.onkeypress(turn_left, "Left")
t.onkeypress(turn_down, "Down")
t.listen()
play()

t.mainloop()