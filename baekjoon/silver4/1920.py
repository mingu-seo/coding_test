'''
수 찾기

A배열 정렬해서 이진 탐색
'''
def binary_search(data, target, start, end):
    if start > end:		 # 범위를 넘어도 못찾는다면 -1을 반환
        return -1

    mid = (start + end) // 2  # 중간값

    if data[mid] == target:	# 중간값의 데이터가 target과 같다면 mid를 반환
        return mid 

    elif data[mid] > target: # target이 작으면 왼쪽 탐색
        end = mid - 1
    else:                    # target이 크면 오른쪽 탐색
        start = mid + 1

    return binary_search(data, target, start, end) # 줄어든 범위를 더 탐색


N = int(input())
A = list(map(int, input().split()))
A = sorted(A)

M = int(input())
B = list(map(int, input().split()))
result = []
for b in B :
    # print(binary_search(A, b, 0, len(A)-1))
    if binary_search(A, b, 0, len(A)-1) > -1 :
        result.append(1)
    else :
        result.append(0)
for r in result :
    print(r)



