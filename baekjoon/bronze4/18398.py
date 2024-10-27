t = int(input())

arr = []
for _ in range(t):
    n = int(input())
    for _ in range(n) :
        numbers = list(map(int, input().split()))
        c1 = 0 # 더한거
        c2 = 1 # 곱한거
        for n in numbers :
            c1 += n
            c2 *= n
        arr.append([c1, c2])

for a in arr :
    print(a[0], a[1])