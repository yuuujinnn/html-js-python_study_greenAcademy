# os(operating system) 모듈 사용하기

import os

os.chdir("c:/green_project/pyworks")    # 경로로 이동

dir = os.popen("dir")   # 목록을 dir 변수에 저장

print(dir.read())   # dir 읽기(출력)