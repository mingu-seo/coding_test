'''
농구 경기

'''
N = int(input())

names = {}
for i in range(N) :
    s = input()[0]
    if names.get(s) != None :
        names[s] = names[s]+1
    else :
        names[s] = 1
# print(names)

result = []
for k,v in names.items():
    if v >= 5:
        result.append(k)

if result :
    result = sorted(result)

    for r in result :
        print(r, sep='', end='')
else :
    print('PREDAJA')