L = int(input())

arr = []
for _ in range(L) :
    n, s = input().split()
    arr.append(s * int(n))

for a in arr :
    print(a)