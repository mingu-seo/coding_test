'''
사과
'''
N = int(input())

total = 0
for i in range(N) :
    s, a = tuple(map(int, input().split()))
    r = a % s
    total += r
print(total)