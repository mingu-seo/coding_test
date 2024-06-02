val = input().split(' ')
val = [int(i) for i in val]

chess = [1,1,2,2,2,8]
result = []
for i,c in enumerate(chess) :
    result.append(chess[i] - val[i])

for r in result:
    print(r, end=' ')