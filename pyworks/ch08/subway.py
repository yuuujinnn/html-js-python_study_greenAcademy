# Seoul Subway > 위키디피아 서울 지하철
import requests
from bs4 import BeautifulSoup

url = 'https://en.wikipedia.org/wiki/Seoul_Metropolitan_Subway'
response = requests.get(url)
print(response) # Response [200] - 상태 코드
print(response.text)
soup = BeautifulSoup(response.text, 'html.parser')
# print(soup)
# print(soup.head)
print(soup.title.text)
print(soup.title.string)

# 지하철 사진 가져오기
target_img = soup.find('img', attrs={'alt': 'Seoul Metro 2000 series train on Line 2'})
# print(target_img)   #<img>

# 이미지 소스 가져오기
target_img_src = target_img.get('src')
# print(target_img_src)

# http 연결
target_img_response = requests.get('https:' + target_img_src)
print(target_img_response.content)  # 이미지 - content, 문자열 - text

# 바이너리 파일 읽고 쓰기(복사, 저장)
with open('./output/train.jpg', 'wb') as f:
    f.write(target_img_response.content)
    print("이미지 파일로 저장했습니다.")