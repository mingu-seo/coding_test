N = int(input())

m = 0
for _ in range(N) :
    a, d, g = map(int, input().split())
    v = a * (d+g)
    if a == d+g : v *= 2
    if m < v : m = v
print(m)