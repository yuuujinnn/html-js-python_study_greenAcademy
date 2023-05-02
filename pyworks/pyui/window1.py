# gui(graphic user interface) 프로그램 만들기
# cui(character user interface) - 명령 프롬프트, console(콘솔)

# import tkinter  모듈 tkinter.py
from tkinter import *

root = Tk()
root.title("처음 만드는 윈도우")
root.geometry("300x200")    # width=300, height= 200, x좌표=300, y좌표=100

# 버튼 생성
# grid()-행열로 배치, pack()-가운데 배치
# Button(root, text='버튼', font=("맑은고딕", 18)).pack()  # pack() - 가운데 위치
btn = Button(root, text='버튼', font=("맑은고딕", 18))
btn.pack()    # pack()-가운데 위치
# btn.grid(row=0, column=0)

root.mainloop()