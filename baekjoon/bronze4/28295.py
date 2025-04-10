direct = ['N','E','S','W']
start = 0

for _ in range(10) :
    v = int(input())
    if v == 1 : # 우향우
        if start+1 > len(direct)-1 :
            start = 0
        else :
            start += 1
    elif v == 2 : # 뒤로 돌아
        if start+2 > len(direct)-1 :
            start = start+2 - (len(direct))
        else :
            start += 2
    elif v == 3 : # 좌향좌
        if start-1 < 0 :
            start = len(direct)-1
        else :
            start -= 1
    # print(v, ':', start)
print(direct[start])
