import sys

T = int(input())

arr = []
for _ in range(T) :
    N = int(sys.stdin.readline())
    arr.append(N**2)

for a in arr :
    print(a)