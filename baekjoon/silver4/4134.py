'''
다음소수

소수인지 판별여부는 전체를 확인할 필요는 없고 제곱근까지만 비교하면 됨
'''
import math
N = int(input())

arr = []
for i in range(N):
    arr.append(int(input()))

for a in arr :
    i = a
    while True :
        isPrime = True
        
        for n in range(2, int(math.sqrt(i))+1):
            # print(i,n)
            if i % n == 0 :
                isPrime = False
                # i = n
                break
        if i < 2: # 입력값이 0이나 1인 경우도 있으므로 따로 처리
            print(2)
            break
        else :
            if isPrime : 
                print(i)
                break
        i += 1