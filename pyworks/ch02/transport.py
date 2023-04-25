# 교통 수단 이용
# &&, ||, ! 사용하지 않음
# 파이썬 - and, or, not 사용

'''
money = 5000
card = False

if money >= 4000 and card:
    print('택시를 탄다.')
elif money >= 2000 or not card:
    print('버스를 탄다.')
else:
    print('걸어간다.')
'''



pocket = ['paper', 'Smartphone', 'money']

#print('paper' in pocket) #True
#print('coin' in pocket) #False
if 'paper' in pocket:
    print('버스를 탄다')
else:
    print('걸어간다')
