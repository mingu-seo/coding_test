A, T = map(int, input().split())
P = 10 + 2 * (25 - A + T)
print(0 if P < 0 else P)