result = []

while True :
    l,w,h,v = map(int, input().split())
    if l==0 and w==0 and h==0 and v==0 :
        break
    if l == 0 :
        l = v // (w*h)
    elif w == 0 :
        w = v // (l*h)
    elif h == 0 :
        h = v // (l*w)
    elif v == 0 :
        v = l*w*h
    result.append([l,w,h,v])

# print(result)
for r in result :
    print(r[0], r[1], r[2], r[3])