n = int(input())

result = []
for _ in range(n) :
    p, q = map(int, input().split())
    f = 1 / (1/p + 1/q)
    # print(round(f,1))
    result.append(round(f,1))
for r in result :
    print('f = {}'.format(r))