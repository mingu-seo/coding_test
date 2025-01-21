import math
n = int(input())

arr = []
for _ in range(n) :
    a1, p1 = map(int, input().split())
    r1, p2 = map(int, input().split())
    if a1 / p1 > r1**2*math.pi / p2 :
        arr.append('Slice of pizza')
    else :
        arr.append('Whole pizza')

for a in arr :
    print(a)