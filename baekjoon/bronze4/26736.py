line = input()

a = 0
b = 0

for l in line :
    if l == 'A' :
        a += 1
    else :
        b += 1
print('{} : {}'.format(a,b))