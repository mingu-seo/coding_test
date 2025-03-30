T = int(input())
result = []

for _ in range(T) :
    aCount = 0
    bCount = 0
    line = input()
    for c in line :
        if c == 'a' :
            aCount += 1
        else :
            bCount += 1
    result.append(min(aCount, bCount))

for r in result :
    print(r)