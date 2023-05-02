import turtle as t
import random

def turn_right():
    t.setheading(0)

def turn_up():
    t.setheading(90)

def turn_left():
    t.setheading(180)

def turn_down():
    t.setheading(270)

def start():    # 게임을 시작하는 함수
    global playing  # playing을 전역변수로 설정
    if playing == False:
        playing = True
        t.clear()   # 메시지를 지움
        play()

def play():
    global score
    global playing
    # 적 거북이가 주인공 거북이 쪽 보며 쫓아가기
    t.forward(10)
    if random.randint(1, 5) == 3: # 3을 뽑을 확률은 20%
        ang = te.towards(t.pos())
        te.setheading(ang)

    speed = score + 5
    if speed > 15:
        speed = 15
    te.forward(speed)   # 적 거북이의 속도(거리)

    # 주인공 거북이가 적 거북이에 닿으면 게임 종료
    if t.distance(te) < 12:
        text = "Score : " + str(score)
        message("Game Over", text)
        playing = False
        score = 0

    # 주인공 거북이가 먹이에 닿으면 점수가 올라감
    if t.distance(tf) < 12:
        score = score + 1
        t.write(score)  # 점수 출력
        start_x = random.randint(-230, 230)
        start_y = random.randint(-230, 230)
        tf.goto(start_x, start_y)

    # 게임 실행(0.1초 콜백)
    if playing:
        t.ontimer(play, 100)

def message(m1, m2):    # 메시지를 화면에 표시하는 함수
    t.clear()
    t.goto(0, 100)
    t.write(m1, False, "center", ("", 20))
    t.goto(0, -100)
    t.write(m2, False, "center", ("", 15))
    t.home()

# 주인공 거북이
t.setup(500, 500)
t.bgcolor('skyblue')
t.shape('turtle')
t.speed(0)
t.up()
t.color('white')

# 점수와 게임 스위치 변수
score = 0
playing = False

# 적 거북이
te = t.Turtle()
te.shape('turtle')
te.color('red')
te.speed(0)
te.up()
te.goto(0, 200)

# 먹이
tf = t.Turtle()
tf.shape('circle')
tf.color('green')
tf.speed(0)
tf.up()
tf.goto(0, -200)

# 키 조종
t.onkeypress(turn_right, "Right")
t.onkeypress(turn_up, "Up")
t.onkeypress(turn_left, "Left")
t.onkeypress(turn_down, "Down")
t.onkeypress(start, 'space')
t.listen()
message("Turtle Run", "[Space]")

t.mainloop()

