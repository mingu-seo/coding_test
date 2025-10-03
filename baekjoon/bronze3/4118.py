result = []

while True :
    N = int(input())
    if N == 0 :
        break
    is_input = True
    values = []
    for _ in range(N) :
        value = list(map(int, input().split()))
        # print(values)
        values.extend(value)
    values.sort()
    values = set(values)
    # print(values)
            
    if len(values) == 49 :
        result.append('Yes')
    else :
        result.append('No')

for r in result :
    print(r)
                