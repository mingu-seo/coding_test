arr = list(map(int, input().split()))

arr.sort(reverse=True)
print(arr[0] + arr[1])