# naver 메뉴 가져오기
import requests
from bs4 import BeautifulSoup

response = requests.get("https://www.naver.com")
# print(response.text)
html = BeautifulSoup(response.text, 'html.parser')
# print(html)

# 메뉴 - 메일, 카페, 블로그
menu_ul = html.find('ul', attrs={'class':'list_nav type_fix'})
# print(menu_ul)
first_li = menu_ul.find('li')
# print(first_li)
first_a = first_li.find('a')
print(first_a.text)

# 다른 메뉴 찾기 - findAll()
all_a = menu_ul.findAll('a')
# print(all_a)
print(all_a[1].text)    # 카페

for a in all_a:
    print(a)
    print(a.text)