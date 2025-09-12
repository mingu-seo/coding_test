n = int(input())

result = []
for _ in range(n) :
    value = input()
    
    cnt = 0
    lenCount = len(value) // 8

    for i in range(lenCount) :
        # print(value[i*8 : i*8+8])
        v = value[i*8 : i*8+8]
        if v.count('1') % 2 == 1 :
            cnt += 1
        # for j in range(i*8, i*8+8) :
        #     print(j)
    result.append(cnt)

for r in result :
    print(r)