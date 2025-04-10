n = int(input())

arr = []
for _ in range(n) :
    lt, wt, le, we = map(int, input().split())
    t = lt * wt
    e = le * we
    if t == e :
        arr.append('Tie')
    elif t > e :
        arr.append('TelecomParisTech')
    else :
        arr.append('Eurecom')
for a in arr :
    print(a)