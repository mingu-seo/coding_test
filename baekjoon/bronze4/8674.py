a, b = map(int, input().split())

if a % 2 == 0 and b % 2 == 0:
    print(0)
else :
    total = a * b
    v1 = abs(a//2 * b - (total - (a//2 * b)))
    v2 = abs(b//2 * a - (total - (b//2 * a)))
    print(min(v1, v2))