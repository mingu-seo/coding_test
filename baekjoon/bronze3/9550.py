T = int(input())
result = []

for _ in range(T) :
    N, K = map(int, input().split())
    numbers = list(map(int, input().split()))
    total = 0
    for n in numbers :
        total += n // K
    result.append(total)

for r in result :
    print(r)