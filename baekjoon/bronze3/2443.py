N = int(input())

for i in range(N) :
    print(' '*i, end='')
    print('*'*((N-i)*2-1))