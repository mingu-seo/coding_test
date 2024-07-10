arr = []
while True :
    a = int(input())
    if a == 0 :
        break
    elif a % 42 == 0 :
        arr.append('PREMIADO')
    else :
        arr.append('TENTE NOVAMENTE')

for a in arr :
    print(a)