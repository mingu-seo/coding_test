n = int(input())

arr = []
for _ in range(n) :
    x = int(input())
    t = 0
    for _ in range(x) :
        lines = list(map(str, input().split()))
        v = float(lines[1]) * float(lines[2])
        t += v
    arr.append(round(t*100)/100)

for a in arr :
    print('${:.2f}'.format(a))
