N = int(input())
result = []

for _ in range(N) :
    a = input()
    b = input()

    cnt = 0
    for i in range(0, len(a)) :
        if a[i] != b[i] :
            cnt += 1
    result.append(cnt)

for r in result :
    print('Hamming distance is {}.'.format(r))