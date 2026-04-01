T = int(input())
result = []

for _ in range(T) :
    line = input().split()
    a = int(line[4])
    x = int(line[0])
    y = int(line[2])
    o = line[1]

    if o == '+' :
        if x + y == a :
            result.append('YES')
        else :
            result.append('NO')
    elif o == '-' :
        if x - y == a :
            result.append('YES')
        else :
            result.append('NO')

for i,r in enumerate(result) :
    print('Case {}: {}'.format(i+1, r))