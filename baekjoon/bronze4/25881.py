p1, p2 = map(int, input().split())
n = int(input())

arr = []
for _ in range(n) :
    v = int(input())
    t = 0
    if v <= 1000 :
        t = v * p1
    else :
        t = 1000*p1 + (v-1000)*p2
    arr.append([v,t])

for a in arr :
    print(a[0], a[1])