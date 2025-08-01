result = []

while True :
    line = list(map(int, input().split()))
    if sum(line) == 0 :
        break
    a, b, c, d = line
    cnt = 0
    while True :
        if a == b == c == d:
            result.append(cnt)
            break

        a2 = abs(a-b)
        b2 = abs(b-c)
        c2 = abs(c-d)
        d2 = abs(d-a)
        a = a2
        b = b2
        c = c2
        d = d2
        cnt += 1

        # print(a,b,c,d)
        
for r in result :
    print(r)