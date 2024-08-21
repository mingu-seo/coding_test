Z = int(input())

arr = []
for _ in range(Z) :
    W, K = map(int, input().split())
    arr.append(W * K // 2)

for a in arr :
    print(a)