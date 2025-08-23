N = int(input())

result = 0
for _ in range(N) :
    x, y = map(float, input().split())
    result += y * x
print(result)