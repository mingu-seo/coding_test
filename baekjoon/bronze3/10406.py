W, N, P = map(int, input().split())

numbers = list(map(int, input().split()))
result = 0
for n in numbers :
    if n >= W and n <= N :
        result += 1
print(result)