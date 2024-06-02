'''
덱 2

'''

import sys
N = int(sys.stdin.readline())

from collections import deque

# queue = []
queue = deque()
result = []
for _ in range(N) :
    cmd = [i for i in sys.stdin.readline().split()]
    if cmd[0] == '1' :
        queue.appendleft(cmd[1])
    elif cmd[0] == '2' :
        queue.append(cmd[1])
    elif cmd[0] == '3' :
        result.append(queue.popleft() if queue else -1)
    elif cmd[0] == '4' :
        result.append(queue.pop() if queue else -1)
    elif cmd[0] == '5' :
        result.append(len(queue))
    elif cmd[0] == '6' :
        result.append(0 if queue else 1)
    elif cmd[0] == '7' :
        result.append(queue[0] if queue else -1)
    elif cmd[0] == '8' :
        result.append(queue[-1] if queue else -1)

for r in result:
    print(r)