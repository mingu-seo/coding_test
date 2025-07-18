arr = list(map(int, input().split()))
arr.sort()

d1 = arr[1] - arr[0]
d2 = arr[2] - arr[1]

print(max(d1, d2)-1)