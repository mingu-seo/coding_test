K = int(input())

arr = []
for _ in range(K) :
    n, s, d = list(map(int, input().split()))
    total = 0
    for _ in range(n) :
        d2, v = list(map(int, input().split()))
        if d2 <= s * d :
            total += v
    arr.append(total)

for i, a in enumerate(arr) :
    print('Data Set {}:'.format(i+1))
    print(a)
    print()