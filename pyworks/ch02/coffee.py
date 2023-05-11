# 커피 자동판매기 프로그램
coffee = 5

while True:
    try:
        coin = int(input("돈을 넣어주세요: "))
                
        if coin == 400:
            print("커피가 나옵니다.")
            coffee -= 1  # coffee = coffee - 1
        elif coin > 400:
            print(f"커피가 나오고, 거스름돈 {coin-400}원을 돌려 받습니다.")
            coffee -= 1
        else:
            print("커피가 나오지 않습니다.")
        print(f"남은 커피의 양은 {coffee}개입니다.")
        # 커피가 0개이면 프로그램 종료        
        if coffee == 0:
            print("커피가 모두 소진되었습니다. 판매를 중지합니다.")
            break
    except:
        pass
  
