'''
TGN
'''
N = int(input())

result = []
for i in range(N) :
    r, e, c = tuple(map(int, input().split()))
    if r < e-c :
        result.append('advertise')
    elif r > e-c :
        result.append('do not advertise')
    else :
        result.append('does not matter')
for r in result:
    print(r)