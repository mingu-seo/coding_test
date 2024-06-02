'''
카드2

리스트로 하니까 시간초과
'''
N = int(input())

from collections import deque

# queue = []
queue = deque()
for i in range(N) :
    queue.append(i+1)

i = 0
while True:
    if len(queue) == 1 : break
    if i % 2 == 0 :
        queue.popleft()
    else :
        queue.append(queue.popleft())
    i += 1
    
print(queue[0])