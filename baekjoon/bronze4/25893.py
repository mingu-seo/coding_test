n = int(input())

arr = []
for _ in range(n) :
    number = list(map(int, input().split()))
    c = 0
    r = ''
    for i in number :
        if i >= 10 : c += 1
    if c == 3 : r = 'triple-double'
    elif c == 2 : r = 'double-double'
    elif c == 1 : r = 'double'
    else : r = 'zilch'
    number.append(r)
    arr.append(number)

for a in arr :
    print(a[0], a[1], a[2])
    print(a[3])
    print()