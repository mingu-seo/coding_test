import math

# v = 2000000000 ** (1/3)
# print(v)
# print(1259 ** 3)

values = []
for i in range(1, 1260) :
    values.append(i ** 3)

T = int(input())
result = []
for i in range(T) : 
    A, B = map(int, input().split())
    s = int(A ** (1/3))
    cnt = 0
    for v in values[s-1:] :
        if v <= B :
            if v >= A :
                cnt += 1
        else :
            break
    # print(cnt) 
    result.append('Case #{}: {}'.format(i+1, cnt))

for r in result :
    print(r)