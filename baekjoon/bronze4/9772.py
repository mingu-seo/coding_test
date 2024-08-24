arr = []
while True :
    x, y = map(float, input().split())

    
    if x == 0 or y == 0 :
        arr.append('AXIS')
    else :
        if x > 0 and y > 0 :
            arr.append('Q1')
        elif x > 0 and y < 0 :
            arr.append('Q4')
        elif x < 0 and y > 0:
            arr.append('Q2')
        elif x < 0 and y < 0 :
            arr.append('Q3')

    if x == 0 and y == 0 :
        break

for a in arr :
    print(a)