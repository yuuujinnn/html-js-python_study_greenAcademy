import random
import turtle as t

playing = False  # 게임 실행 상태 변수
score = 0        # 점수

# 악당 거북이(빨간색)
te = t.Turtle()
te.shape("turtle")
te.shapesize(1.5)
te.color("red")
te.speed(0)
te.up()
te.goto(0, 200)

# 먹이(초록색 동그라미)
tf = t.Turtle()
tf.shape("circle")
tf.color("green")
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

def start():
    global playing
    if playing == False:
        playing = True
        t.clear()
        play()

def play():
    global playing
    global score

    if playing:  # playing == True
        t.ontimer(play, 100)  # 0.1초 간격으로 계속 play

    t.forward(10)

    if random.randint(1, 5) == 3:
        ang = te.towards(t.pos())
        te.setheading(ang)
    speed = score + 5

    if speed > 15:
        speed = 15
    te.forward(speed) # 적 거북이 속도

    if t.distance(te) < 12:  # 적 거북이에 닿으면 게임 종료
        text = "Score : " + str(score)
        message("Game Over", text)
        playing = False
        score = 0

    if t.distance(tf) < 12:  # 주인공과 먹이의 거리가 12보다 작으면(가까우면)
        score = score + 1
        t.write(score)
        start_x = random.randint(-230, 230)
        start_y = random.randint(-230, 230)
        tf.goto(start_x, start_y)

def message(m1, m2):
    t.clear()
    t.goto(0, 100)
    t.write(m1, False, "center", ("", 20))  # 글꼴 크기 20
    t.goto(0, -100)
    t.write(m2, False, "center", ("", 15))  # 글꼴 크기 15
    t.home()  # 주인공 거북이의 처음 위치(0, 0)

t.title("Turtle Run")
t.setup(500, 500)
t.bgcolor('orange')
t.shape('turtle')
t.shapesize(1.5)
t.color('white')    # 주인공 거북이(흰색)
t.speed(0)
t.up()

t.onkeypress(turn_right, "Right")
t.onkeypress(turn_up, "Up")
t.onkeypress(turn_left, "Left")
t.onkeypress(turn_down, "Down")
t.onkeypress(start, "space")
t.listen()
message("Turtle Run", "[Space]")


t.mainloop()