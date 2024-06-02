value = input().split(' ')
N = int(value[0])
M = int(value[1])

box = [i for i in range(1, N+1)]

for i in range(M):
    value = input().split(' ')
    temp = box[int(value[0])-1]
    box[int(value[0])-1] = box[int(value[1])-1]
    box[int(value[1])-1] = temp

for v in box:
    print('{} '.format(v), end='')