N, K = map(int, input().split())
result = 0

member = 0
for _ in range(N) :
    a, b = map(int, input().split())
    member += a
    member -= b
    if member > K and member - K > result : 
        result = member - K
print(result)