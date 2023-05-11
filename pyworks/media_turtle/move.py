import turtle as t

t.shape('turtle')
for i in range(4):
    t.forward(100)
    t.left(90)

for i in range(3):
    t.left(120)
    t.forward(100)

t.shapesize(1.5)
t.color('blue')
for i in range(3):
    t.right(120)
    t.forward(100)

for i in range(4):
    t.forward(100)
    t.right(90)




t.mainloop()