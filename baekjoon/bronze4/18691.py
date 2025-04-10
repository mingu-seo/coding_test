T = int(input())
arr = []

for _ in range(T):
    g, c, e = map(int, input().split())
    rest = e - c
    if rest <= 0 :
        arr.append(0)
    else :
        needCount = rest * (g*2-1)
        
        arr.append(needCount)

for a in arr :
    print(a)
