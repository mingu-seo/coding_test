'''
N과 M(1)

'''
N, M = map(int, input().split())

arr = []
for i in range(1, N+1):
    arr.append(i)
# print(arr)

from itertools import permutations
p = permutations(arr, M)
# print(list(p))
for i in list(p):
    for j in i :
        print(j, end=' ')
    print()