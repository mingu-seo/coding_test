val = int(input())

for i in range(val):
    print(' '*(val-i-1), end='')
    print('*'*(i+1))