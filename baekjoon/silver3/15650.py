'''
N과 M(2)

'''
N, M = map(int, input().split())

arr = []
for i in range(1, N+1):
    arr.append(i)
# print(arr)

from itertools import combinations
p = combinations(arr, M)
# print(list(p))
for i in list(p):
    for j in i :
        print(j, end=' ')
    print()