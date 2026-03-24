T = int(input())
result = []

for _ in range(T) :
    N, D = map(int, input().split())
    cnt = 0
    for _ in range(N) :
        v, f, c = map(int, input().split())
        if v * (f/c) >= D :
            cnt += 1
    result.append(cnt)

for r in result :
    print(r)
        