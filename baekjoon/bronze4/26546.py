n = int(input())

arr = []
for _ in range(n) :
    line = input().split()
    s = int(line[1])
    e = int(line[2])

    v = ''
    for i, c in enumerate(line[0]) :
        if i < s or i > e-1 :
            v += c
    arr.append(v)

for a in arr :
    print(a)