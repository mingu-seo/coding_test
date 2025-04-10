n, m = map(int, input().split())

mi = min(n,m)
ma = max(n,m)

if mi == ma :
    print(mi + ma)
else :
    print(mi*2 + 1)