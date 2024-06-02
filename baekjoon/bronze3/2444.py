val = int(input())

size = val * 2 - 1
arr = [abs(i) for i in range(-(val-1), val)]

for a in arr:
    print(' '*a, end='', sep='')
    print('*'*((val-a)*2-1))