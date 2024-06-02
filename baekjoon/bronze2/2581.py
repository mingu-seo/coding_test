M = int(input())
N = int(input())

total = 0
minPrime = 0
cntPrime = 0
for i in range(M, N+1):
    isPrime = True
    for j in range(2, i//2+1) :
        print(i, j)
        if i % j == 0 :
            isPrime = False
            break
    if i > 1 and isPrime :    
        cntPrime += 1
        total += i
        if minPrime == 0: minPrime = i
if cntPrime == 0 :
    print(-1)
else :
    print(total)
    print(minPrime)