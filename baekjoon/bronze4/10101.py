values = []
for i in range(3):
    values.append(int(input()))

if values[0] == 60 and values[1] == 60 and values[2] == 60 :
    print('Equilateral')
    exit(0)
if values[0] + values[1] + values[2] == 180 :
    equalsCount = 0
    for i in range(len(values)):
        for j in range(i+1, len(values)) :
            if values[i] == values[j] :
                equalsCount += 1
    if equalsCount == 1 :
        print('Isosceles')
    elif equalsCount == 0 :
        print('Scalene')
else :
    print('Error')