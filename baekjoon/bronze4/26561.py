n = int(input())
arr = []
for _ in range(n) :
    p, t = map(int, input().split())
    p = p + (t//4) - (t//7)
    arr.append(p)
for a in arr :
    print(a)