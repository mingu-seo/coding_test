M, H = map(int, input().split())
N = int(input())

max_value = []

for _ in range(N) :
    a, b = map(int, input().split())
    v = max(a*M, b*H)
    max_value.append(v)

print(sum(max_value))