val = input().split(' ')
h = int(val[0])
m = int(val[1])

if m - 45 < 0:
    if h == 0:
        h = 23
    else :
        h = h - 1
    m = 60 - (45-m)
else :
    m = m - 45
print(h, m)