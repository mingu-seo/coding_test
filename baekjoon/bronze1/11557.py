'''
Yangjojang of The Year

딕셔너리로 학교별 술소비량 저장, 정렬
'''
T = int(input())

result = []
for i in range(T):
    N = int(input())
    school = {}
    for j in range(N):
        name, alchol = tuple(input().split())
        school[name] = int(alchol)
    school = sorted(school.items(), key=lambda item : item[1], reverse=True)
    # print(school)
    result.append(school[0][0])
for r in result :
    print(r)