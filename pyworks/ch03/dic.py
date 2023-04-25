# 자료구조 - 딕셔너리(dictionary)
# {key : value}
person = {'name': '오상식', 'age': 35, 'phone': '010-1234-5678'}
#print(person)

# 특정 요소 출력
print("이름: ", person['name'])

# 요소 추가
person['email'] = 'green@green.com'

# 요소 삭제
#del person['phone']
person.pop('phone') #key로 삭제

# 요소 수정
person['age'] = 30

# 전체 출력
for key in person:
    #print(키, 값)
    print(key, ':', person[key])


# 용어 사전
# try ~ except
print(' 용어 사전 ')
while True:
    try: 
        word = input("단어를 입력하세요: ")

        dic = {
            "이진수" : "컴퓨터가 사용하는 0과 1로 이루어진 수",
            "버그" : "프로그램이 적절하게 동작하는 데 실패하거나 오류가 발생하는 코드",
            "알고리즘" : "어떤 문제를 해결하기 위해 정해진 일련의 절차"
        }

        #print(dic['이진수'])
        definition = dic[word]
        print(definition)
        break
    except KeyError:
        print("정의된 단어가 없습니다.")
