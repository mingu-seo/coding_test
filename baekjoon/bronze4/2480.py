val = input().split(' ')

cnt = 0
maxVal = 0
equVal = 0
for i in range(len(val)) :
    nextI = i+1
    for j in range(nextI, len(val)) :
        # print(i, j)
        if val[i] == val[j] :
            cnt += 1
            equVal = int(val[i])
    if maxVal < int(val[i]) : maxVal = int(val[i])

# print(maxVal, equVal, cnt)
price = 0
if cnt == 3 : # 3개가 같은 경우
    price = 10000 + equVal * 1000
elif cnt == 1 : # 2개가 같은 경우
    price = 1000 + equVal * 100
else :
    price = maxVal * 100
print(price)