n = int(input())
result = []

for _ in range(n) :
    m = int(input())
    arr = []

    for _ in range(m) :
        v = int(input())
        if v < 6 :
            arr.append(v+1)
    result.append(arr)

for i,r in enumerate(result) :
    print('Case {}:'.format(i+1))
    for n in r :
        print(n)