# 라이브러리 사용
from itertools import combinations

result = list(combinations([1,2,3,4],2))
print(result)


# 직접 구현
arr = [1,2,3,4]
result = []
def comb(result, current, arr, start, k) :
    if k == 0 :
        
        result.append(current.copy()) # 깊은복사로 새로운 배열로 저장해야함
        return

    i = start
    while i <= len(arr)-k :
        current.append(arr[i])
        comb(result, current, arr, i+1, k-1)
        current.pop(-1)
        i += 1
    
comb(result, [], arr, 0, 2)
print(result)