s = 0
N, S = map(int, input().split())
for i in range(N) :
    a = int(input())
    s += a
    if i < N-1 and s > S :
        s -= 1

print(s)