# 단위 변환기 - 테스트용
from tkinter import *

class App:
    def __init__(self, root):
        frame = Frame(root)
        frame.pack()

        Label(frame, text="deg C").grid(row=0, column=0)
        Button(frame, text="변환", command=self.convert).grid(row=1, column=0)

    def convert(self):
        print("아직 구현하지 않음")

root = Tk()
root.title("온도 변환기")
root.geometry("200x50")
app = App(root)

root.mainloop()