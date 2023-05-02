# 용어 사전 만들기
from tkinter import *

def select():
    try:
        word = entry.get()
        definition = dic[word] #dic[key] = value
        output.delete(0.0, END)
        output.insert(END, dic[word])
    except KeyError:
        output.insert(END, "단어의 정의를 찾을 수 없습니다.")

win = Tk()
win.title("용어 사전")

lbl = Label(win)
lbl.config(text='단어를 입력하고 엔터 키를 누르세요')
lbl.grid(row=0, column=0)

entry = Entry(win, width=20, bg='yellowgreen')
entry.grid(row=1, column=0, sticky=W)

btn = Button(win, command=select, text="제출")
btn.grid(row=2, column=0, sticky=W)

output = Text(win, width=80, height=10, bg='yellowgreen')
output.grid(row=3, column=0, sticky=W)

dic = {
    "html" : "하이퍼 텍스트 마크업 언어로 웹 페이지를 구성하는 언어이다.",
    "HTML" : "하이퍼 텍스트 마크업 언어로 웹 페이지를 구성하는 언어이다.",
    "css" : "웹 페이지를 구성하는 요소로 디자인을 담당하는 웹 기술이다.",
    "CSS" : "웹 페이지를 구성하는 요소로 디자인을 담당하는 웹 기술이다.",
    "함수" : "명령이나 기능을 수행하는 재사용 가능한 코드 조각이다."
}

win.mainloop()