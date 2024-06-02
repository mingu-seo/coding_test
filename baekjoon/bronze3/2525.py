hm = input().split(' ')
h = int(hm[0])
m = int(hm[1])
time = int(input())

if m + time == 60:
    if h == 23 :
        h = 0
    else :
        h = h + 1
    m = 0
elif m + time > 60 :
    h = h + (m+time)//60
    if h == 24 : h = 0
    elif h > 24 :
        h = h % 24
    m = (m+time) % 60
elif m + time < 60 :
    m = m + time
print(h, m)