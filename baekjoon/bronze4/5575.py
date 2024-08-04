arr = []
for _ in range(3) :
    arr.append(tuple(map(int, input().split())))

for a in arr :
    AT = [a[3],a[4],a[5]]
    AT[2] = AT[2]-a[2]
    
    if AT[2] < 0 :
        AT[1] -= 1
        AT[2] += 60
    if AT[1] < 0 : 
        AT[0] -= 1
        AT[1] += 60

    AT[1] = AT[1] - a[1]
    if AT[1] < 0 :
        AT[0] -= 1
        AT[1] += 60

    AT[0] -= a[0]

    print(AT[0], AT[1], AT[2])