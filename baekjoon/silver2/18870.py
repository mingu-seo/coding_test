'''
입력값 배열로 저장

'''
import sys

def merge_sort(arr):
    if len(arr) < 2:
        return arr

    mid = len(arr) // 2
    low_arr = merge_sort(arr[:mid])
    high_arr = merge_sort(arr[mid:])

    merged_arr = []
    l = h = 0
    while l < len(low_arr) and h < len(high_arr):
        if low_arr[l] < high_arr[h]:
            merged_arr.append(low_arr[l])
            l += 1
        else:
            merged_arr.append(high_arr[h])
            h += 1
    merged_arr += low_arr[l:]
    merged_arr += high_arr[h:]
    return merged_arr

N = int(sys.stdin.readline())
iArr = [int(i) for i in sys.stdin.readline().split()]

cArr = set(iArr) # 비교할 배열
cArr = list(cArr)
# cArr.sort()
cArr = merge_sort(cArr)
cArr2 = []

rArr = {}

for idx in [i for i in range(len(cArr))] :
    rArr[cArr[idx]] = idx

for i in iArr :
    print(rArr[i], end=' ')