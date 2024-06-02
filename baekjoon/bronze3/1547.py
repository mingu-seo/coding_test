'''
공
'''
M = int(input())

cup = [1,0,0]
for _ in range(M) :
    v1, v2 = list(map(int, input().split()))
    temp = cup[v1-1]
    cup[v1-1] = cup[v2-1]
    cup[v2-1] = temp

for i, v in enumerate(cup) :
    if v == 1 : print(i+1)