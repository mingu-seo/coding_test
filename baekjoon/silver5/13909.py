'''
창문 닫기

아래처럼 하니까 메모리 초과
'''
# import math
# N = int(input())

# N2 = N
# arr = [True] * N2

# for i in range(1,N2):
#     # print(i, end=' ')
    
#     for j in range(i, N2, i+1):
#         # print(i,j)
#         # arr[j] = abs(arr[j]-1)
#         arr[j] = False if arr[j] else True


# print(arr)
# print(sum(arr))

'''
3부터 차례대로 해보니까 규칙이 있음
True, False 2번 : 0
True, False 2번, True : 3
True, False 2번, True False 4번 : 8
True, False 2번, True False 4번 True False 6번 : 15

3 : 1
4 : 2
9 : 3
16 : 4
'''

import math
N = int(input())
result = int(math.sqrt(N))
print(result)