N = int(input())
result = []

for _ in range(N) :
    s = int(input())
    n = int(input())

    total = s
    for _ in range(n) :
        q, p = map(int, input().split())
        total += q * p
    result.append(total)

for r in result :
    print(r)