arr = list(map(int, input().split()))
arr.sort()
# 1 -> 4 -> 3 -> 2 순서
# 4 -> 1 -> 3 -> 2 값
# print(arr)
# 젤작은값, 젤큰값 중 작은값 * 중간값들 중에 큰값
print(min(arr[0], arr[3]) * max(arr[1], arr[2]))