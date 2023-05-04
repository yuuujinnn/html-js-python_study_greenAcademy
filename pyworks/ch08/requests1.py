# requests 모듈 : python의 HTTP 라이브러리
# url을 가져올 수 있음

import requests

url = 'https://www.python.org/'
response = requests.get(url)
print(response) # 200 코드는 정상
print(response.status_code)
html = response.text
print(html)

url2 = 'https://www.python.org/3'
response2 = requests.get(url2)
print(response2)

# 로봇 배제 표준 - robots.txt
# 무분별하게 검색 로봇(소프트웨어)이 접근하는 것을 막는 규정
urls = ['https://www.python.org/', 'https://www.daum.net/']
filename = 'robots.txt'

# print(urls[0] + filename)

for url in urls:
    url_path = url + filename
    print(url_path)
    response = requests.get(url_path)
    print(response)