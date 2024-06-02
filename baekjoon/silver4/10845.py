'''
큐

'''
import sys
N = int(sys.stdin.readline())

from collections import deque

# queue = []
queue = deque()
result = []
for _ in range(N) :
    cmd = [i for i in sys.stdin.readline().split()]
    if cmd[0] == 'push' :
        queue.append(cmd[1])
    elif cmd[0] == 'pop' :
        result.append(queue.popleft() if queue else -1)
    elif cmd[0] == 'size' :
        result.append(len(queue))
    elif cmd[0] == 'empty' :
        result.append(0 if queue else 1)
    elif cmd[0] == 'front' :
        result.append(queue[0] if queue else -1)
    elif cmd[0] == 'back' :
        result.append(queue[-1] if queue else -1)

for r in result:
    print(r)