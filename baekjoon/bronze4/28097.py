n = int(input())
arr = list(map(int, input().split()))

total = sum(arr) + (n-1) * 8
print(total // 24, total % 24)