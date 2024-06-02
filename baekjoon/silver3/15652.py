'''
N과 M(4)

중복순열
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
        comb(result, current, arr, i, k-1) # start를 i로만 바꿔주면됨
        current.pop(-1)
        i += 1
    
comb(result, [], arr, 0, M)

for r in result :
    for e in r :
        print(e, end=' ')
    print()