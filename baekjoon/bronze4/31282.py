N, M, K = map(int, input().split())

m = N
k = 0

cnt = 0
while True :
    m += M
    k += K
    
    cnt += 1
    if k >= m : break
print(cnt)