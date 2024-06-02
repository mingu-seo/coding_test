val = input().split(' ')
size = int(val[0])
min = int(val[1])

target = input().split(' ')
result = []
for t in target:
    if min > int(t) :
        # result.append(t)
        print(t, sep='', end=' ')