a, b = map(int, input().split())

# (v / a - a) / a - a = b
v = (((b + a) * a) + a) * a
# print((v // a - a) // a - a)
print(v)