import sys
N = int(sys.stdin.readline())
t = 0
for _ in range(N) :
    t += int(sys.stdin.readline())
print(t - (N-1))