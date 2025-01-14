N, M = list(map(int, input().split()))

arr = []
for _ in range(N) :
    line = input()
    line2 = ''
    for i in range(len(line)-1, -1, -1) :
        line2 += line[i]
    arr.append(line2)

for a in arr :
    print(a)