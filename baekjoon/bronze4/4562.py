'''
No Brainer


'''
n = int(input())

result = []
for i in range(n) :
    X, Y = tuple(map(int, input().split()))

    if X >= Y :
        result.append('MMM BRAINS')
    else :
        result.append('NO BRAINS')

for r in result :
    print(r)