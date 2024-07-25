N = int(input())

arr = []
for _ in range(N):
    a, b, c = map(int, input().split())
    if (a <= b and b <= c) or (a >= b and b >= c) :
        arr.append('Ordered')
    else :
        arr.append('Unordered')

print('Gnomes:')
for a in arr :
    print(a)