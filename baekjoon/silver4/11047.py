'''
동전 0

지폐문제랑 비슷
전체 반복 다 돌아도 시간초과 안됨
'''

N, K = map(int, input().split())

coin = []
for i in range(N) :
    coin.append(int(input()))

result = 0
for i in range(len(coin)-1, -1, -1) :
    c = coin[i]
    result += K // c
    K = K % c
print(result)