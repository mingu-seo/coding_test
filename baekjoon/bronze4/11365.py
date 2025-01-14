
arr = []
while True :
    value = input()
    if value == 'END' : break
    value2 = ''
    for i in range(len(value)-1, -1, -1) :
        value2 += value[i]
    arr.append(value2)

for a in arr :
    print(a)