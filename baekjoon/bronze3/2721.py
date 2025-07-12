# W(n) = Sum[k=1..n; k*T(k+1)]
T =[]
T.append(0)
prev_i = 0
for i in range(1, 302) :
    prev_i = i-1
    next_sum = T[prev_i]
    # print('next_sum',next_sum)
    for i2 in range(prev_i+1, i+1) :
        # print('i2:', i2)
        next_sum += i2
    T.append(next_sum)
# print(T)
n = int(input())
result = []
for _ in range(n) :
    v = int(input())
    r = 0
    for i in range(1, v+1) :
        r += i*T[i+1]
    result.append(r)

for r in result :
    print(r)