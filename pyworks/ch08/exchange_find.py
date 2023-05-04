# 환율 정보 - 네이버 > 증권 > 시장지표
import requests
from bs4 import BeautifulSoup

url = "https://finance.naver.com/marketindex/"
response = requests.get(url)

html = BeautifulSoup(response.text, 'html.parser')
ul = html.find('ul', attrs={'class':'data_lst'})
first_li= ul.find('li')     # 미국 USD만 찾음
# print(first_li)
exchange = first_li.find('span', attrs={'class':'blind'})   # 환율의 종류
# print(exchange.text)

value = first_li.find('span', attrs={'class':'value'})   # 환율의 가격
# print(value.text)
print(exchange.text, ':', value.text)

# 전체 환율
all_li = ul.findAll('li')

for li in all_li:
    exchange = li.find('span', attrs={'class': 'blind'})
    # print(exchange.text)
    value = li.find('span', attrs={'class': 'value'})
    # print(value.text)
    # print(exchange.text, ':', value.text)
    print(exchange.text.split(' ')[-1], ':', value.text)