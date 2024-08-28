n = int(input())

arr = []
for _ in range(n) :
    x = int(input())
    r = ''
    if x % 2 == 0 :
        r = 'even'
    else :
        r = 'odd'
    arr.append('{} is {}'.format(x, r))

for a in arr :
    print(a)