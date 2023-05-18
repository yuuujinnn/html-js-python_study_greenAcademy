# 순위 정하기
score = [60, 5, 33, 12, 97, 24]
rank = [1, 1, 1, 1, 1, 1]
n = len(score)
print(n)

# 중첩 for문 - 조건문
for i in range(0, n):
    for j in range(0, n):
        if score[i] < score[j]:
            rank[i] += 1  #순위 1증가(순위가 밀림)

'''
i=0 j=0 score[0] < score[0] False rank[0]=1
    j=1 score[0] < score[1] False rank[0]=1
    j=2 score[0] < score[2] False rank[0]=1
    j=3 score[0] < score[3] False rank[0]=1
    j=4 score[0] < score[4] True rank[0]=2
    j=5 score[0] < score[4] False rank[0]=2(순위 확정)
i=1 j=0 score[1] < score[0] True rank[1]=2
    j=1 score[1] < score[1] False rank[1]=2
    j=2 score[1] < score[2] True rank[1]=3
    j=3 score[1] < score[3] True rank[1]=4
    j=4 score[1] < score[4] True rank[1]=5
    j=5 score[1] < score[5] True rank[1]=6(순위 확정)
i=2 j=0 score[2] < score[0] True rank[2]=2
    j=1 score[2] < score[1] False rank[2]=2
    j=2 score[2] < score[2] False rank[2]=2
    j=3 score[2] < score[3] False rank[2]=2
    j=4 score[2] < score[4] True rank[2]=3
    j=5 score[2] < score[5] True rank[2]=3(순위 확정)
'''

print(rank)