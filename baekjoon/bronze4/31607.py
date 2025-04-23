A = int(input())
B = int(input())
C = int(input())

arr = [A,B,C]
arr = sorted(arr)

if arr[2] == arr[0] + arr[1] :
    print(1)
else :
    print(0)