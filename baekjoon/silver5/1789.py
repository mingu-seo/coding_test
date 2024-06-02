'''
수들의 합

최대길이므로
1부터 차례대로 반복시켜서
리스트에 저장해놓고, N보다 커지면 마지막 빼고, 1씩 증가해서 N과 같아지는지 비교
'''
from collections import deque
S = int(input())

n = 1
cnt = 0
size = deque()
total = 0
for i in range(1, S+1):
    cnt += 1
    size.append(i)
    total += i
    if total > S:
        size.pop()
        total -= i
        while True :
            size[-1] = size[-1] + 1
            total += 1
            if total >= S :
                break
    if total == S :
        print(len(size))
        break
    