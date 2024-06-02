'''
골드바흐 파티션

미리 백만게의 소수여부를 판별한 배열을 생성해 놓고
입력받은 수가 소수와 소수의 합이 몇개인 판단

함수를 호출하는 형태로 하는게 더 빠름
'''
import math
N = int(input())

def getPrimeList(number):
    a = [True]*number

    for i in range(2,number):
        if a[i]:
            for j in range(i*i, number, i):
                a[j] = False
    return a

def main() :
    result = []
    a = getPrimeList(1000000)
    for _ in range(N) :
        n = int(input())
        cnt = 0
        for i in range(2, n//2+1):
            if a[i] and a[n-i]:
                cnt += 1
        result.append(cnt) 

    for r in result:
        print(r)

main()