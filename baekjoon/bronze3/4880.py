
result = []
while True :
    a1, a2, a3 = map(int, input().split())
    if a1 == 0 and a2 == 0 and a3 == 0 :
        break
    a12 = a2 - a1
    a32 = a3 - a2
    value = []
    if a12 == a32 :
        value.append('AP')
        value.append(a3 + a32)
    else :
        value.append('GP')
        value.append(a3 + a32 * (a32 // a12))
    result.append(value)

for r in result :
    print(r[0], r[1])