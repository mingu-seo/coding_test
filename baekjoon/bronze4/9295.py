T = int(input())
arr = []
for _ in range(T):
    x, y = map(int, input().split())
    arr.append(x+y)

for i, a in enumerate(arr) :
    print('Case {}: {}'.format(i+1, a))