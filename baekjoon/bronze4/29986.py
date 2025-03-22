N, H = map(int, input().split())

arr = list(map(int, input().split()))
result = 0
for a in arr :
    if a <= H :
        result += 1
print(result)