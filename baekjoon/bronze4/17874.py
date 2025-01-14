n, h, v = map(int, input().split())

if n - h > h : h = n - h
if n - v > v : v = n - v

print(h * v * 4)