T = int(input())
result = []

for _ in range(T) :
    values = list(map(int, input().split()))
    values.sort()
    if values[2] ** 2 == values[0] ** 2 + values[1] ** 2 :
        result.append('YES')
    else :
        result.append('NO')

for i, v in enumerate(result) :
    print('Case #{}: {}'.format(i+1, v))
