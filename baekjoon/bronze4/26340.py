n = int(input())

arr = []
for _ in range(n) :
    data = list(map(int, input().split()))

    a = max(data[0], data[1])
    b = min(data[0], data[1])
    for _ in range(data[2]) :
        c = a // 2
        d = b

        a = max(c, d)
        b = min(c, d)
    data.append([a,b])
    arr.append(data)

for a in arr :
    print('Data set:', a[0], a[1], a[2])
    print(a[3][0], a[3][1])
    print()