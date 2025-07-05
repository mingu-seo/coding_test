N = int(input())
# 0, 9
# 1, 7
# 2, 5
# 3, 3
# 4, 1
for i in range(N):
    print(' ' * i, end='')
    print("*" * ((N-i)*2-1))

for i in range(N-2, -1, -1) :
    print(' ' * i, end='')
    print("*" * ((N-i)*2-1))
