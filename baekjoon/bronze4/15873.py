v = input()
r = 0
if v[0:2] == '10' :
    r = int(v[0:2]) + int(v[2:])
else :
    r = int(v[0]) + int(v[1:])
print(r)