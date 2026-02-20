N, M = map(int, input().split())

r = N // M
if N % M > 0 : r = r+1
print(r)