n = int(input())

m = 0
for _ in range(n) :
    h, w = map(int, input().split())
    v = h * w
    if m < v : m = v
print(m)