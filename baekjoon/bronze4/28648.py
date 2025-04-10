n = int(input())
import sys
mi = sys.maxsize
for _ in range(n) :
    t, l = map(int, input().split())
    if mi > t+l :
        mi = t+l
print(mi)