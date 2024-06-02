'''
분산처리

'''

# for i in range(1,10) :
#     for j in range(1, 15):
#         print('{} ^ {} = {}'.format(i,j,i ** j))
'''
9 ^ 1 = 9
9 ^ 2 = 81
9 ^ 3 = 729
9 ^ 4 = 6561
9 ^ 5 = 59049
9 ^ 6 = 531441
9 ^ 7 = 4782969
9 ^ 8 = 43046721
9 ^ 9 = 387420489

9->1->9->1

8 ^ 1 = 8
8 ^ 2 = 64
8 ^ 3 = 512
8 ^ 4 = 4096
8 ^ 5 = 32768
8 ^ 6 = 262144
8 ^ 7 = 2097152
8 ^ 8 = 16777216
8 ^ 9 = 134217728

8->4->2->6 : 1승과 5승이 같음
7 9 3 1
6 6 6 6
5 5 5 5
4 6 4 6
3 9 7 1
2 4 8 6

전부 공통적으로 4개 단위로 반복됨
'''
import sys
T = int(sys.stdin.readline())

result = []
for i in range(T) :
    a, b = tuple(map(int, sys.stdin.readline().split()))

    if a % 10 == 0 :
        result.append(10)
    else :
        result.append(a ** ((b % 4)+4) % 10)

for r in result:
    print(r)