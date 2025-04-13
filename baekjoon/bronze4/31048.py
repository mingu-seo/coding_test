T = int(input())

result = []
for _ in range(T) :
    N = int(input())
    r = 1

    for n in range(2, N+1) :
        r = (r*n) % 10
    result.append(r)

for r in result :
    print(r)