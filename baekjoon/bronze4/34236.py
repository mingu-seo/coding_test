N = int(input())

arr = list(map(int, input().split()))

v = arr[1] - arr[0]
print(arr[N-1] + v)