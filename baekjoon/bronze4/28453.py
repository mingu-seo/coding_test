N = int(input())

result = []
values = list(map(int, input().split()))

for v in values :
    if v >= 300 :
        result.append(1)
    elif v >= 275 :
        result.append(2)
    elif v >= 250 :
        result.append(3)
    else :
        result.append(4)

for r in result:
    print(r, end=' ')