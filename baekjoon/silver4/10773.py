'''
제로

스택형태로 구현
'''
import sys
K = int(sys.stdin.readline())

stack = []
for i in range(K):
    v  = int(sys.stdin.readline())
    if v == 0 :
        stack.pop()
    else :
        stack.append(v)

print(sum(stack))