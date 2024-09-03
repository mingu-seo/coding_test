n = int(input())

arr = []
for _ in range(n) :
    values = list(map(int, input().split()))

    total = values[1] + values[2] + values[3]
    result = 'FAIL'
    if  total >= 55 :
        if values[1] >= 35 * 0.3 and values[2] >= 25*0.3 and values[3] >= 40*0.3 :
            result = 'PASS'
    arr.append('{} {} {}'.format(values[0], total, result))

for a in arr :
    print(a)