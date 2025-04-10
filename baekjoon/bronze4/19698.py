N, W, H, L = map(int, input().split())

w = W // L
h = H // L
r = w * h

if r > N :
    print(N)
else :
    print(r)