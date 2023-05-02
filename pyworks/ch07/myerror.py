# 사용자 예외 만들기
# raise -> 사용하는 쪽에서(try ~ except)
# Exception 클래스를 상속
class MyError(Exception):
    def __str__(self):
        return "허용되지 않는 별명입니다."

def say_nick(nick):
    if nick == '바보':
        raise MyError()
    print(nick)

try:
    say_nick('영웅')
    say_nick('바보')
except MyError as e:
    print(e)