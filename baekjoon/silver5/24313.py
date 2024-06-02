f = [int(i) for i in input().split()]
c = int(input())
n = int(input())

'''
if c*n >= f[0]*n + f[1]: 이 조건에서는 틀림
왜냐하면 c는 양수이지만 f값은 음수일 수 있으므로
f[0] <= c 이 조건이 추가되어야 함
'''

if c*n >= f[0]*n + f[1] and f[0] <= c:
    print(1)
else :
    print(0)