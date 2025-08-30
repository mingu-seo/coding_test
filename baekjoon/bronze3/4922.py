result = []

while True :
    N = int(input())
    if N == 0 :
        break
    r = 1
    for i in range(1, N) :
        # print(r, i*2 )
        r = r + (i * 2)
    result.append('{} => {}'.format(N, r))

for r in result :
     print(r)