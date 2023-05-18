# time 모듈
import time

# 1부터 10까지 출력 (1초 간격으로 출력)
start = time.time()

for i in range(1, 11):
    time.sleep(0.5)
    print(i)

end = time.time()
et = end - start
print("수행 시간 : {0:.2f}".format(et))