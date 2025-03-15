T = int(input())

result = []
for i in range(T) :
    N = int(input())
    msg = ''
    if N > 4500 :
        msg = 'Round 1'
    elif N > 1000 :
        msg = 'Round 2'
    elif N > 25 :
        msg = 'Round 3'
    else :
        msg = 'World Finals'
    result.append('Case #{}: {}'.format(i+1, msg))

for r in result :
    print(r)