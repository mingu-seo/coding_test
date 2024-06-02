'''
queuestack

10000개 일때 6초
'''


import sys
import time

start = time.time()

N = 10000 # 자료구조 개수

A = [int(0) for i in range(10000)] # 0:큐, 1:스택

from collections import deque
questack = deque()

B = [int(i) for i in range(1,10001)] # 원소

# 원소 삽입 (큐인것만 저장하면 됨)
for i in range(len(A)) :
    if A[i] == 0 : 
        # e = deque()
        # e.append(B[i])
        # questack.append(e)
        questack.append(B[i])

# print(questack)

M = 10000 # 삽입할 수열의 길이
C = [int(i) for i in range(1,10001)]

result = deque()
for c in C :
    temp = c # 임시
    ## 어차피 다 큐이기 때문에 그냥 처리
    
    questack.appendleft(temp)
    # temp = questack.popleft()
    # for i, q in enumerate(questack) :
        # if A[i] == 0 : # 큐
        # q.append(temp)
        # temp = q.popleft()
        
        # else : # 스택
        #     q.appendleft(temp)
        #     temp = q.popleft()
    # print(questack)
    result.append(temp)

for i in range(len(C)) :
    print(questack[len(C)-1-i], end=' ')



end = time.time()
print(end - start)