
result = []
# r = 26 # 인치
# d = r * 3.1415927 / (12 * 5280) * 1000 # / 1000/60/60 
# print(d)

cnt = 1
while True :
    try :
        r, c, t = map(float, input().split()) # 지름, 회전, 시간
        if c == 0 : continue
        # 거리
        distance = r * 3.1415927 / (12 * 5280) * c
        # 속도
        mph = distance / (t/60/60)
        result.append([cnt, distance, mph])
        cnt += 1
    except Exception as e:
        break

for r in result :
    print('Trip #{}: {:.2f} {:.2f}'.format(r[0], r[1], r[2]))