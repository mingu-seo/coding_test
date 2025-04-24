n = int(input())

arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
arr3 = list(map(int, input().split()))

cnt = 0
if arr1.count(7) : cnt += 1
if arr2.count(7) : cnt += 1
if arr3.count(7) : cnt += 1

if cnt == 3 :
    print(777)
else :
    print('0')