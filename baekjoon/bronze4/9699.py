n = int(input())

arr = []
for i in range(n):
    values = map(int, input().split())
    arr.append('Case #{}: {}'.format(i+1, max(values)))

for a in arr :
    print(a)