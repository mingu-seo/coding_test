N = int(input())
result = []

for j in range(N) :
    number = list(map(int, input().split()))
    r = False
    for i,n in enumerate(number) :
        a = i % 5 + 1
        if a == n :
            r = True
        else :
            r =  False
            break
    if r == True :
        result.append(j+1)

for r in result :
    print(r)