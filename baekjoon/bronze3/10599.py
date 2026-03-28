result = []

while True :
    a, b, c, d = map(int, input().split())
    if a == 0 and b == 0 and c == 0 and d == 0 :
        break
    min_age = min(c,d) - max(a,b)
    max_age = max(c,d) - min(a,b)
    result.append([min_age, max_age])

for r in result :
    print(r[0], r[1])