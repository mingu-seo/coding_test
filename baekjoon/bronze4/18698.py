n = int(input())

arr = []
for _ in range(n) :
    cnt = 0
    value = input()
    for i, v in enumerate(value) :
        if v == 'U' :
            cnt += 1
        else :
            arr.append(cnt)
            cnt = 0
            break
        if i == len(value)-1 : 
            arr.append(cnt)
            cnt = 0

for a in arr :
    print(a)