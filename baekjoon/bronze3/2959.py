arr = list(map(int, input().split()))
arr.sort()
# 1 -> 4 -> 3 -> 2 순서
# 4 -> 1 -> 3 -> 2 값
# print(arr)
print(min(arr[0], arr[3]) * max(arr[1], arr[2]))