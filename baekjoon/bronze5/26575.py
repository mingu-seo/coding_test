n = int(input())

result = []
for _ in range(n) :
    values = input().split(' ')
    for i in range(len(values)) :
        if values[i][0] == '.' :
            values[i] = '0'+values[i]
        values[i] = float(values[i])
    v = values[0]*values[1]*values[2]
    # print('${:.2f}'.format(v))
    result.append('${:.2f}'.format(v))

for r in result :
    print(r)