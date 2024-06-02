# 라이브러리 사용
from itertools import permutations

result = list(permutations([1,2,3,4],2))
print(result)


# 직접 구현
arr = [1,2,3,4]
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