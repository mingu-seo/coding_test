X, Y = map(int, input().split())
N = int(input())
arr = []

min_value = X / Y
for _ in range(N) :
    x, y = map(int, input().split())
    if min_value > x / y :
        min_value = x / y
print(min_value * 1000)