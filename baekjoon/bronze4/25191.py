N = int(input())
A, B = map(int, input().split())

r = A // 2 + B
if r > N : r = N
print(r)