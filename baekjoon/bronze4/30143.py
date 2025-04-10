T = int(input())
result = []

for _ in range(T) :
    N, A, D = map(int, input().split())

    total = A
    number = A
    for n in range(1, N) :
        # print(total)
        number += D
        total += number
    result.append(total)

for r in result :
    print(r)