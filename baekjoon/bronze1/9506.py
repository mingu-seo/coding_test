arr = []
while True:
    value = int(input())
    if value == -1 :
        break
    arr2 = []
    for i in range(1, value//2+1):
        if value % i == 0:
            arr2.append(i)
    if value == sum(arr2):
        arr2 = [str(i) for i in arr2]
        arr.append('{} = {}'.format(value, ' + '.join(arr2)))
    else :
        arr.append('{} is NOT perfect.'.format(value))
    
for a in arr:
    print(a)
