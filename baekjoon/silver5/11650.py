import sys
'''
입력값 리스트로 저장 후
병합정렬로 정렬
- 병합정렬 내에서 x값([0])으로 먼저 비교 후 같으면 y값([1])로 비교

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
        if low_arr[l][0] < high_arr[h][0]:
            merged_arr.append(low_arr[l])
            l += 1
        elif low_arr[l][0] > high_arr[h][0]:
            merged_arr.append(high_arr[h])
            h += 1
        else:
            if low_arr[l][1] < high_arr[h][1]:
                merged_arr.append(low_arr[l])
                l += 1
            elif low_arr[l][1] > high_arr[h][1]:
                merged_arr.append(high_arr[h])
                h += 1
    merged_arr += low_arr[l:]
    merged_arr += high_arr[h:]
    return merged_arr

N = int(sys.stdin.readline())

arr = []

for i in range(N):
    values = [int(i) for i in sys.stdin.readline().split()]
    arr.append([values[0], values[1]])
    
arr = merge_sort(arr)


for i, e in enumerate(arr) :
    print(e[0], e[1])