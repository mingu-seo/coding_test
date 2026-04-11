N = int(input())

between = 0

for i in range(N) :
    first = N - i - 1
    for _ in range(first) :
        print(' ', end='', sep='')
    l = 2 * (i+1) - 1
    for j in range(l) :
        if j == 0 : print('*', end='')
        elif j > 0 and j == l-1 : print('*', end='')
        else : print(' ', end='')
    print()
