'''
queuestack

'''

import sys

N = int(sys.stdin.readline()) # 자료구조 개수

A = [int(i) for i in sys.stdin.readline().split()] # 0:큐, 1:스택

from collections import deque
questack = deque()

B = [int(i) for i in sys.stdin.readline().split()] # 원소

# 원소 삽입 (큐인것만 저장하면 됨)
for i in range(len(A)) :
    if A[i] == 0 : 
        questack.append(B[i])

M = int(sys.stdin.readline()) # 삽입할 수열의 길이
C = [int(i) for i in sys.stdin.readline().split()]

for c in C :
    temp = c # 임시
    questack.appendleft(temp)

for i in range(len(C)) :
    print(questack[-1-i], end=' ')