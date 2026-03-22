result = []
while True :
    l, w, a = map(int, input().split())
    if l == 0 and w == 0 and a == 0 :
        break
    else :
        if l == 0 :
            l = a // w
        elif w == 0 :
            w = a // l
        elif a == 0 :
            a = l * w
        result.append([l,w,a])

for r in result:
    print(r[0], r[1], r[2])