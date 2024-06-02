'''
N과 M(3)

중복조합
'''

N, M = map(int, input().split())

arr = []

for i in range(1, N+1):
    arr.append(i)

result = []
def comb(result, current, arr, start, k) :
    if k == 0 :
        
        result.append(current.copy()) # 깊은복사로 새로운 배열로 저장해야함
        return

    i = start
    while i < len(arr) :
        current.append(arr[i])
        comb(result, current, arr, 0, k-1)
        current.pop(-1)
        i += 1
    
comb(result, [], arr, 0, M)

for r in result :
    for e in r :
        print(e, end=' ')
    print()