'''
5로 먼저 나누는 반복과 3으로 나누는 반복을 완전탐색으로 전부구한 후 그 중 가작 작은 수
'''
N = int(input())

result = []
for f in range(N):
    for t in range(N):
        if N == f*5 + t*3 :
            result.append(f+t)
if result :
    print(min(result))
else :
    print(-1)