g, p, t = map(int, input().split())

t1 = g * p # 전체
t2 = g + t*p # 양성인 그룹만 전체

if t1 < t2 :
    print(1)
elif t2 < t1 :
    print(2)
else :
    print(0)
