n = int(input())

arr = []
for _ in range(n) :
    v = list(map(str, input().split()))
    if v[0] == v[1] :
        arr.append('OK')
    else :
        arr.append('ERROR')
for a in arr :
    print(a)