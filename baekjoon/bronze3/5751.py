result = []

while True :
    n = int(input())
    if n == 0 : break
    values = list(map(int, input().split()))
    m = 0 # Marry 
    j = 0 # Johne
    for v in values :
        if v == 0 :
            m += 1
        elif v == 1 :
            j += 1
    result.append('Mary won {} times and John won {} times'.format(m, j))

for r in result :
    print(r)