T = int(input())
result = []
for _ in range(T):
    s = input()
    t = 0
    for c in range(65, 91) :
        if chr(c) not in s :
            t += c
    result.append(t)

for r in result :
    print(r)