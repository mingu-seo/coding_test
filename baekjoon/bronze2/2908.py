val = input().split(' ')
v1 = ''
for v in val[0]:
    v1 = v + v1
v2 = ''
for v in val[1]:
    v2 = v + v2
if int(v1) > int(v2) : print(v1)
else : print(v2)