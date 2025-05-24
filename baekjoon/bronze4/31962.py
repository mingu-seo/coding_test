N, X = map(int, input().split())
v = -1
for _ in range(N) :
    S, T = map(int, input().split())
    if S+T <= X :
        if v < S :
            v = S
print(v) 