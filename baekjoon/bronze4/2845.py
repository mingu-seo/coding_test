L, P = map(int, input().split())
arr = map(int, input().split())
result = []
for a in arr :
    R = L * P
    result.append(a - R)

for r in result :
    print(r, end=' ')