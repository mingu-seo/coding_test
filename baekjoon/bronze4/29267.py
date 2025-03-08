n, k = map(int, input().split())

c_k = 0 # 현재탄약
v = 0 # 저장할탄약
for i in range(n) :
    line = input()
    if i == 0 and line == 'load' : c_k = 0
    else :
        if line == 'save' :
            v = c_k
        elif line == 'load' :
            c_k = v
        elif line == 'shoot' :
            c_k = c_k-1
        elif line == 'ammo' :
            c_k += k
    print(c_k)
