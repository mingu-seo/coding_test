value = input().split(' ')
N = int(value[0])
M = int(value[1])

box = [0 for i in range(N)]

for i in range(M):
    value = input().split(' ')
    for j in range(int(value[0]), int(value[1])+1):
        box[j-1] = int(value[2])

for v in box:
    print('{} '.format(v), end='')