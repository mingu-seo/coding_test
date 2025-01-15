n = int(input())

arr = []
for _ in range(n) :
    a, b = map(float, input().split())
    c = max(a, b) - min(a,b)
    arr.append(c)

for a in arr :
    print(round(a*10)/10)