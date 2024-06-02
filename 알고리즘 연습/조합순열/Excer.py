arr = [1,2,3,4]
# 순열
from itertools import permutations
result = list(permutations(arr,2))
print(result)

# 순열 구현(재귀)
result = []
def perm(result, current, arr, k) :
    if k==0 :
        result.append(current.copy()) # 깊은복사로 새로운 배열로 저장해야함
        return

    for i in range(len(arr)) :
        if arr[i] in current :
            continue
        current.append(arr[i])
        perm(result, current, arr, k-1)
        current.pop()
    
perm(result, [], arr, 2)
print(result)

# 중복순열 구현(재귀)
result = []
def perm(result, current, arr, k) :
    if k==0 :
        result.append(current.copy()) # 깊은복사로 새로운 배열로 저장해야함
        return

    for i in range(len(arr)) :
        # if arr[i] in current :
        #     continue
        current.append(arr[i])
        perm(result, current, arr, k-1)
        current.pop()
    
perm(result, [], arr, 2)
print(result)


# 조합
from itertools import combinations
result = list(combinations(arr, 2))
print(result)

# 조합 구현(재귀) 2번째
def comb(result, current, arr, start, k) :
    if k == 0:
        result.append(current.copy())
        return
    
    for i in range(start, len(arr)-k+1) :
        current.append(arr[i])
        comb(result, current, arr, i+1, k-1)
        current.pop()

result = []
comb(result, [], arr, 0, 2)
print(result)

# 중복가능 조합
def comb(result, current, arr, start, k) :
    if k == 0:
        result.append(current.copy())
        return
    
    for i in range (start, len(arr)-k+1):
        current.append(arr[i])
        comb(result, current, arr, 0, k-1)
        current.pop()

result = []
comb(result, [], arr, 0, 2)
print(result)