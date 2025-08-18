A, B = map(int, input().split())
C, D = map(int, input().split())

v1 = A/C + B/D
v2 = C/D + A/B
v3 = D/B + C/A
v4 = B/A + D/C

v = max(v1, v2, v3, v4)
print([v1, v2, v3, v4].index(v))