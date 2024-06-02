'''
상근이의 친구들
'''

result = []
while True :
    v1, v2 = tuple(map(int, input().split()))
    if v1 == 0 and v2 == 0 :
        break
    result.append(v1 + v2)
for r in result :
    print(r)