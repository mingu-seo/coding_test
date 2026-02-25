k, s = map(int, input().split())

r = s // k
r += s % k

print(r)