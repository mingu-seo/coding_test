# k light
k1, k2 = map(int, input().split())
# lambda light
l1, l2 = map(int, input().split())
# heavy
h1, h2, h3 = map(int, input().split())

r = (k1*k2 + l1*l2) * (h1*h2*h3)
print(r)