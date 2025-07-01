N = int(input())

blank = 5-N

for i in range(N, 0, -1) :
    print(' ' * (N-i), end='')
    print('*'*i)