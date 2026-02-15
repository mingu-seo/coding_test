T = int(input())
result = []

for _ in range(T) :
    t = int(input())

    t2 = t % 25
    if t2 < 17 :
        result.append('ONLINE')
    else :
        result.append('OFFLINE')

for r in result :
    print(r)