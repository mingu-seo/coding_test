arr = list(map(int, input().split()))

arr = sorted(arr)

if arr[0] == arr[1] and arr[1] == arr[2] :
    print(2)
elif arr[2] ** 2 == arr[1] ** 2 + arr[0] ** 2 :
    print(1)
else :
    print(0)