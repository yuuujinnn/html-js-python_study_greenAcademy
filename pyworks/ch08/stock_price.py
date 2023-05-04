# 주식 종목 가져오기 - 네이버 금융 > 증권 > 증권 홈 > 우측 하단(인기 종목 검색)
import requests
from bs4 import BeautifulSoup

def getcontent(item_code):
    url = 'https://finance.naver.com/item/main.naver?code=' + item_code
    response = requests.get(url)
    content = BeautifulSoup(response.text, 'html.parser')
    return content

content = getcontent('005930')  # 호출
today = content.find('div', attrs={'class':'today'})
print(today)
price = today.find('span', attrs={'class':'blind'})
# print(price.text)
print(f'에코프로 주가 : {price.text}원')