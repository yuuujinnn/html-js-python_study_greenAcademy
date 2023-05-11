import requests
from bs4 import BeautifulSoup
from tkinter import *


def lotto_win():
    # num = 1066
    num = entry.get()  # 입력박스에 입력된 값
    url = "https://www.dhlottery.co.kr/gameResult.do?method=byWin&drwNo={}".format(num)
    response = requests.get(url)
    # print(response.text)

    soup = BeautifulSoup(response.text, "html.parser")
    win_result = soup.select_one('div.win_result')  # 태그이름.클래스이름
    # win_result.text #'\n'을 확인함
    win_list = win_result.text.split('\n')
    print(win_list)
    win_list = win_result.text.split('\n')[7:13]
    print(win_list)
    bonus_num = win_result.text.split('\n')[-4]
    print(bonus_num)

    # 출력상자에 번호 출력
    output.delete(0.0, END)  # 첫행, 첫문자 위치에서 시작
    output.insert(END, f'당첨번호: {win_list}\n\n보너스: {bonus_num}')
    '''
    print('당첨번호')
    print(win_list)
    print('보너스번호')
    print(bonus_num)
    '''

# lotto_win()
window = Tk()
window.title("로또 당첨 확인")

Label(window, text="당첨 회차 입력: ").grid(row=0, column=0, sticky=W)
# 입력상자
entry = Entry(window, bg='yellow')
entry.grid(row=1, column=0, sticky=W)

btn = Button(window, text="당첨 번호 확인", command=lotto_win)
btn.grid(row=2, column=0, sticky=W)
# 출력 상자
output = Text(window, bg='skyblue', width=50, height=5)
output.grid(row=3, column=0, sticky=W)

window.mainloop()