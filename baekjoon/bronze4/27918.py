n = int(input())
d = 0
p = 0
for _ in range(n) :
    v = input()
    if abs(d - p) != 2 :
        if v == 'D' :
            d += 1
        elif v == 'P' :
            p += 1
print('{}:{}'.format(d, p))