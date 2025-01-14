n = int(input())

arr = []

for _ in range(n) :
    arr.append(list(map(int, input().split())))


for a in arr :
    for i in range(a[1]) :
        print('X' * a[0])
    print()