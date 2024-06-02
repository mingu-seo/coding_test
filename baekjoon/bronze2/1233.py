'''
주사위

'''
d1, d2, d3 = tuple(map(int, input().split()))

result = {}
for i in range(1, d1+1) :
    for j in range(1, d2+1) :
        for k in range(1, d3+1) :
            v = i+j+k
            # print(v)
            if result.get(v) :
                result[v] += 1
            else :
                result[v] = 1
# print(result)
max_v = 0
max_k = 0

for k,v in result.items():
    if max_v < v :
        max_v = v
        max_k = k
    elif max_v == v :
        if max_k > k :
            max_k = k
print(max_k)