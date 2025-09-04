result = []
while True :
    c = float(input())
    if c == 0.00 : break

    n = 2
    total = 0
    while True :
        total += 1 / n
        
        if total >= c :
            break
        n += 1
    result.append(n-1)

for r in result :
    print('{} card(s)'.format(r))