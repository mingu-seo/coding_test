A, B = map(int, input().split())

v1 = A + B
v2 = A - B

print(max(v1, v2))
print(min(v1, v2))