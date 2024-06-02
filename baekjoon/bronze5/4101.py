'''
크냐?
'''
result = []

while True :
    v1, v2 = tuple(map(int, input().split()))
    if v1 == 0 and v2 == 0 : break
    if v1 > v2 :
        result.append('Yes')
    else :
        result.append('No')

for r in result:
    print(r)