m, d = map(int, input().split())

p = d // m
if d % m > 0 : p = p + 1

print(p)