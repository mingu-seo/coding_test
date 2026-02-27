answer = input()
N = int(input())
result = []

for _ in range(N) :
    A = 0
    B = 0
    value = input()
    for i, v in enumerate(value) :
        if v == answer[i] :
            A += 1
        if v in answer :
            B += 1
    result.append([B,A])

for r in result :
    print(r[0], r[1])