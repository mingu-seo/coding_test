arr = []

while True :
    values = [int(i) for i in input().split()]
    
    if values[0] == 0 and values[1] == 0 and values[2] == 0:
        break
    arr.append(values)

for v in arr :
    v.sort()
    if v[2] >= v[0] + v[1] : 
        print('Invalid')
    elif v[0] == v[1] and v[0] == v[2] :
        print('Equilateral')
    else :
        equalCount = 0
        for i in range(len(v)):
            for j in range(i+1, len(v)):
                if v[i] == v[j] :
                    equalCount += 1
        if equalCount == 1 :
            print('Isosceles')
        else :
            print('Scalene')