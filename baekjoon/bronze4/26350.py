n = int(input())

arr = []
for _ in range(n) :
    numbers = list(map(int, input().split()))
    s = 'Denominations:'
    isDenomation = True
    for i in range(1, len(numbers)) :
        s += ' ' + str(numbers[i])
        if i > 1 and isDenomation and numbers[i] / numbers[i-1] < 2 :
            isDenomation = False
    if isDenomation :
        s += '\nGood coin denominations!'
    else :
        s += '\nBad coin denominations!'
    arr.append(s)

for a in arr :
    print(a)
    print()