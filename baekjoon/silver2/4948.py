'''
베르트랑 공준
'''
import sys

number = 123456 * 2
a = [False,False] + [True]*(number-1)
primes=[]

for i in range(2,number+1):
    if a[i]:
        primes.append(i)
        for j in range(2*i, number+1, i):
            a[j] = False

result = []
while True :
    n = int(sys.stdin.readline())

    if n == 0 : break

    cnt = 0
    for i in range(n+1, n*2+1):
        if a[i] :
           cnt += 1
    result.append(cnt) 
    
for r in result:
    print(r)