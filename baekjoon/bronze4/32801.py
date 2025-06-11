n, a, b = map(int, input().split())

r1 = 0
r2 = 0
r3 = 0

for i in range(1, n+1) :
    if i % a == 0 and i % b == 0 :
        r3 += 1
    elif i % a == 0 :
        r1 += 1
    elif i % b == 0 :
        r2 += 1
print(r1, r2, r3)