valStr = []
while True :
    val = input().split(' ')
    if val[0] == '0' and val[1] == '0' :
        break
    valStr.append(val)

for val in valStr:
    print(int(val[0]) + int(val[1]))