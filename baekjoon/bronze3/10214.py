'''
Baseball


'''
import sys
T = int(sys.stdin.readline())

result = []
for i in range(T) :
    score = [0,0]
    for j in range(9) :
        y, k = tuple(map(int, sys.stdin.readline().split()))
        score[0] += y
        score[1] += k
    if score[0] > score[1] :
        result.append('Yonsei')
    elif score[0] < score[1] :
        result.append('Korea')
    else :
        result.append('Draw')

for r in result :
    print(r)