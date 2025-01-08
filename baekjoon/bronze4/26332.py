n = int(input())
arr = []

for _ in range(n) :
    cp = list(map(int, input().split()))
    p = 0
    if cp[0] >= 2 :
        r = cp[1] + ((cp[1] - 2) * (cp[0]-1))
    else :
        r = cp[1] * cp[0]
    cp.append(r)
    arr.append(cp)

for a in arr :
    print(a[0], a[1])
    print(a[2])
