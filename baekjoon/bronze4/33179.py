N = int(input())
pages = list(map(int, input().split()))

result = 0
for p in pages :
    result += p // 2
    if p % 2 > 0 : result += 1
print(result)