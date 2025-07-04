N = int(input())
# 1, 7
# 2, 5
# 3, 3
# 4, 1
for i in range(1, N):
    print("*" * i, end='')
    print(' ' * ((N-i)*2), end='')
    print("*" * i)
print('*' * (N*2))
for i in range(N-1, 0, -1) :
    print('*' * i, end='')
    print(' ' * ((N-i)*2), end='')
    print("*" * i)

# 4, 1
# 3, 3
# 2, 5
# 1, 7