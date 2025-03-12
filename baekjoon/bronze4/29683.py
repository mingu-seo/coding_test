n, A = map(int, input().split())

arr = list(map(int, input().split()))
result = 0

for a in arr :
    result += a // A
print(result)