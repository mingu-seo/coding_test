'''
소수구하기

'''
import math
N, M = (int(i) for i in input().split())

arr = []
for i in range(N, M+1) :
    isPrime = True
    for j in range(2, int(math.sqrt(i))+1) :
        if i % j == 0 :
            isPrime = False
            break
    if i > 1 and isPrime :
        arr.append(i)

for a in arr :
    print(a)