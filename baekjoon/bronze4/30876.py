N = int(input())

result = [1000,1000]
for _ in range(N) :
    x, y = map(int, input().split())
    if y <= result[1] :
        result[0] = x
        result[1] = y

print(result[0], result[1]) 