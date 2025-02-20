N, X = map(int, input().split())
A = list(map(int, input().split()))

price = []
for i in range(N-1) :
    p = A[i]*X + A[i+1]*X
    price.append(p)
print(min(price))