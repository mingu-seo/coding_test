N = int(input())

arr = []
for _ in range(N) :
    A, B, X = map(int, input().split())
    arr.append((X-1) * A + B)

for a in arr:
    print(a)