def merge_sort(arr):
    if len(arr) < 2:
        return arr

    # 두개의 배열로 분리
    mid = len(arr) // 2
    # 재귀호출
    low_arr = merge_sort(arr[:mid])
    high_arr = merge_sort(arr[mid:])

    # 병합시킬 배열
    merged_arr = []
    l = h = 0 # 왼쪽, 오른쪽배열 길이 변수
    while l < len(low_arr) and h < len(high_arr): # l변수가 low배열길이보다 작고, h변수가 hing배열길이보다 작으면
        # low배열의 값보다 high 배열의 값이 더 크면
        if low_arr[l] < high_arr[h]:
            merged_arr.append(low_arr[l]) # low배열값을 추가
            l += 1 # l변수 +1
        else:
            merged_arr.append(high_arr[h]) # hihg배열값을 추가
            h += 1 # h변수 +1
            
    merged_arr += low_arr[l:]
    merged_arr += high_arr[h:]
    return merged_arr

