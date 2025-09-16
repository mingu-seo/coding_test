result = []

while True :
    a, b = map(int, input().split())
    if a == 0 and b == 0 :
        break
    c = a - b
    r1 = c // 2
    r2 = 0
    if c > 1 and c % 2 > 0 :
        r2 = 1
        r1 -= 1
    
    result.append([r1, r2])

for r in result :
    print(r[0], r[1])