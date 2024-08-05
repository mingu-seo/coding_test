
a = list(map(int, input().split()))
b = list(map(int, input().split()))

total_a = sum(a)
total_b = sum(b)

print(max(total_a, total_b))