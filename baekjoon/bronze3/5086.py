arr = []
while True:
    value = input().split()
    n1 = int(value[0])
    n2 = int(value[1])
    if n1 == 0 and n2 == 0:
        break
    arr.append([n1, n2])

for a in arr:
    if a[1] % a[0] == 0 :
        print('factor')
    elif a[0] % a[1] == 0 :
        print('multiple')
    else :
        print('neither')