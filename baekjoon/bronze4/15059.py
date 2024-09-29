a = list(map(int, input().split()))
b = list(map(int, input().split()))

t = b[0] - a[0] if a[0] < b[0] else 0
t += b[1] - a[1] if a[1] < b[1] else 0
t += b[2] - a[2] if a[2] < b[2] else 0

print(t)