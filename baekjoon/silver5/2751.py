'''
시간제한으로
입력받는부분도 input() 대신 sys.stdin.readline()
정렬도 병합정렬 적용
'''

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

import sys
N = int(sys.stdin.readline())
arr = []
for i in range(N):
    inputValue = int(sys.stdin.readline())
    arr.append(inputValue)
arr = merge_sort(arr)
for v in arr:
    print(v)


