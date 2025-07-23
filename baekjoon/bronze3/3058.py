N = int(input())

result = []
for _ in range(N) :
    arr = list(map(int, input().split()))
    total = 0
    min_value = max(arr)
    for a in arr :
        if a % 2 == 0 :
            total += a
            if min_value > a :
                min_value = a
    result.append([total, min_value])

for r in result :
    print(r[0], r[1])