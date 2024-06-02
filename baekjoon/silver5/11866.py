'''
요세푸스 문제 0


'''
NK = [int(i) for i in input().split()]

# from collections import deque
# queue = deque()
# for i in range(1, NK[0]+1) :
#     queue.append(i)
arr = [i for i in range(1, NK[0]+1)]
K = NK[1]

# print(arr)
i = -1
result = []
while True :
    if arr :
        # i += K
        # print(i, arr)
        # if i > len(arr)-1 :
        #     i = i - len(arr)
        for _ in range(K):
            i += 1
            if i > len(arr)-1 :
                i = 0
        # print('뺄 index:{}'.format(i))
        v = arr.pop(i)
        i -= 1
        result.append(v)
    else :
        break
print('<', end='')
for i, r in enumerate(result) :
    print(r, end='')
    if i < len(result)-1 : print(', ', end='')
print('>')