S, D, I, L, N = map(int, input().split())

avg = (S+D+I+L)/4

if avg < N :
    print(int((N-avg) * 4))
else :
    print(0)