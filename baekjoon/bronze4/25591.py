x, y = map(int, input().split())

a = 100 - x
b = 100 - y

c = 100 - (a+b)
d = a*b

q = d // 100
r = d % 100

x2 = q+c if q > 0 else c
y2 = r

print(a, b, c, d, q, r)
print(x2, y2)