# 주식 종목 가져오기 - 네이버 금융 > 증권 > 증권 홈 > 우측 하단(인기 종목 검색)
import requests
from bs4 import BeautifulSoup

def getcontent(item_code):
    url = 'https://finance.naver.com/item/main.naver?code=' + item_code
    response = requests.get(url)
    content = BeautifulSoup(response.text, 'html.parser')
    return content

def getprice(item_code):
    content = getcontent(item_code)  # 호출
    today = content.find('div', attrs={'class': 'today'})
    price = today.find('span', attrs={'class': 'blind'})
    return price

에코프로 = getprice('086520')
삼성전자 = getprice('005930')
네이버 = getprice('035420')

print(f'에코프로 주가: {에코프로.text}원')
print(f'삼성전자 주가: {삼성전자.text}원')
print(f'네이버 주가: {네이버.text}원')