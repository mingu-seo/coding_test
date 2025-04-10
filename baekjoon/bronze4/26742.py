line = input()
b = 0
c = 0
for l in line :
    if l == 'B' :
        b += 1
    else :
        c += 1
print(b // 2 + c // 2)