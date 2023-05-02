from tkinter import *

def convert():
    try:
        temp_c = eval(ent_c.get())  # eval - 문자열 매개변수를 숫자로 변환
        txt_f.delete(0.0, END)
        temp_f = temp_c * 1.8 + 32
        temp_f = "{: .1f}F".format(temp_f)  # 소수 자리수 설정
        txt_f.insert(END, temp_f)
    except NameError:
        txt_f.insert(END, '오류')



root = Tk()
root.title('온도 변환기')
root.geometry("240x80+100+100")

Label(root, text=' degree C').grid(row=0, column=0)
ent_c = Entry(root, width=15)   # 입력 - 섭씨온도
ent_c.grid(row=0, column=1)

Label(root, text='  degree F').grid(row=1, column=0)
txt_f = Text(root, width=15, height=1)
txt_f.grid(row=1, column=1)     # 출력 - 화씨온도

Button(root, text='변환', width=10, command=convert).grid(row=2, columnspan=2)

root.mainloop()