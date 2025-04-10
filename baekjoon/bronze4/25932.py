n = int(input())

arr = []
for _ in range(n) :
    numbers = list(map(int, input().split()))
    row = []
    if 18 in numbers and 17 in numbers :
        row = [numbers, 'both']
    elif 18 in numbers :
        row = [numbers, 'mack']
    elif 17 in numbers :
        row = [numbers, 'zack']
    else :
        row = [numbers, 'none']
    arr.append(row)

for a in arr :
    for n in a[0]:
        print(n, end=' ')
    print()
    print(a[1])
    print()
