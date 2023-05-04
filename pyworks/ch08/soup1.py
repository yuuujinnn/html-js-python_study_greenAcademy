# BeautifulSoup4 라이브러리 - html 태그 파싱(Parsing)
# BeautifulSoup(html 내용, 'html.parser')
#find(태그, attr = {키:값}
from bs4 import BeautifulSoup

html_str = """
<html>
    <head>
        <title>웹 스크래핑(크롤링)</title>
    </head>
    <body>
        <ul class='item'>
            <li>인공지능</li>        
            <li>빅데이터</li>        
            <li>로봇</li>        
        </ul>
        <ul class='comlang'>
            <li>Python</li>        
            <li>C/C#</li>        
            <li>Java</li>        
        </ul>
    </body>
</html>
"""
soup = BeautifulSoup(html_str, 'html.parser')
first_ul = soup.find('ul', attrs={'class':'item'})
# print(first_ul)
# print(first_ul.text)    # 태그 없이 텍스트 출력
first_li = soup.find('li')
# print(first_li)

all_li = first_ul.findAll('li')
print(all_li)
print(all_li[1])
print(all_li[1].text)

for li in all_li:
    # print(li)
    print(li.text)
