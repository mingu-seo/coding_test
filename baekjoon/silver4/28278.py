'''
스택2

입력은 반드시 sys.stdin.readline() 사용해야함
input() 사용하면 시간초과
'''
import sys
N = int(sys.stdin.readline())
stack = []
for i in range(N):
    v = [int(e) for e in sys.stdin.readline().split()]
    if v[0] == 1 :
        stack.append(v[1])
    elif v[0] == 2 :
        if stack :
            print(stack.pop())
        else :
            print(-1)
    elif v[0] == 3:
        print(len(stack))
    elif v[0] == 4:
        if stack :
            print(0)
        else :
            print(1)
    elif v[0] == 5 :
        if stack :
            print(stack[len(stack)-1])
        else :
            print(-1)