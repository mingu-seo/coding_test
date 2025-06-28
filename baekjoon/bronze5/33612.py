N = int(input())
N = (N-1)*7

y = 2024 + N // 12
m = 8 + N % 12
if m > 12 :
    y += 1
    m = m - 12
print(y, m)