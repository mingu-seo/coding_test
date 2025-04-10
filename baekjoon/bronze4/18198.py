value = input()

a = 0
b = 0
duice = False
for i in range(0, len(value), 2) :
    if value[i] == 'A' :
        a += int(value[i+1])
    else :
        b += int(value[i+1])
    if a == 10 and a == b : duice = True

    if duice == True :
        if a - 2 >= b : print('A')
        elif b - 2 >= a : print('B')
    else :
        if a >= 11 : print('A')
        elif b >= 11 : print('B')