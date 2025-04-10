n = int(input())

arr = []
for _ in range(n) :
    i, f = map(int, input().split())
    if (i <= 1 and f <= 2) or (i <= 2 and f <= 1) :
        arr.append('Yes')
    else :
        arr.append('No')

for a in arr :
    print(a)