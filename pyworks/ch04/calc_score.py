# 학생의 4명 성적 통계

student = [
    {'name': '이대한', 'kor': 80, 'eng': 80, 'math': 75},
    {'name': '박민국', 'kor': 70, 'eng': 65, 'math': 75},
    {'name': '오상식', 'kor': 75, 'eng': 70, 'math': 50},
]

#print(student[0])
#print(len(student))
print("== 개인별 성적표 ==")
print("이름  국어 영어 수학")
for std in student:
    #print(std['name'], std['kor'], std['eng'], std['math'])
    print(f"{std['name']}  {std['kor']}  {std['eng']}  {std['math']}")

print("== 개인별 총점과 평균 ==")
print("이름   총점  평균")
for std in student:
    total = std['kor'] + std['eng'] + std['math']
    avg = total / 3
    print(f"{std['name']}  {total}   {avg:0.2f}")

# 과목별 총점과 평균
sum_subj = [0, 0, 0]
avg_subj = [0, 0, 0]

for std in student:
    sum_subj[0] += std['kor']
    sum_subj[1] += std['eng']
    sum_subj[2] += std['math']

print("== 과목별 총점 ==")
print("국어  영어  수학")
print(f"{sum_subj[0]}  {sum_subj[1]}  {sum_subj[2]}")

#과목별 평균
avg_subj[0] = sum_subj[0] / len(student)
avg_subj[1] = sum_subj[1] / len(student)
avg_subj[2] = sum_subj[2] / len(student)

print("== 과목별 평균 ==")
print("국어  영어  수학")
print(f"{avg_subj[0]} {avg_subj[1]} {avg_subj[2]}")