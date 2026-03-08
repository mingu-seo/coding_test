T = int(input())
result = []

for _ in range(T) :
    input()
    N = int(input())
    total = 0
    for _ in range(N) :
        n = int(input())
        total += n
    if total % N == 0 :
        result.append('YES')
    else :
        result.append('NO')

for r in result :
    print(r)