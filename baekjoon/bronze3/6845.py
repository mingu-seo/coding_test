n = int(input())

results = []

v_y = 2007
v_m = 2
v_d = 27
for _ in range(n) :
    line = list(map(int, input().split()))
    result = ''
    if line[0] < v_y - 18 :
        result = 'Yes'
    elif line[0] > v_y - 18 :
        result = 'No'
    else :
        if line[1] < v_m :
            result = 'Yes'
        elif line[1] > v_m : 
            result = 'No'
        else :
            if line[2] <= v_d :
                result = 'Yes'
            else :
                result = 'No'
    results.append(result)

for r in results :
    print(r)