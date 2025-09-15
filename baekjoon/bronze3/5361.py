prices = [350.34, 230.90, 190.55, 125.30, 180.90]

n = int(input())
result = []
for _ in range(n) :
    values = map(int, input().split())
    total = 0
    for i, v in enumerate(values) :
        total += v * prices[i]
    result.append('${:.2f}'.format(total))

for r in result :
    print(r)