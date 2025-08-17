K, L = map(int, input().split())

min_value = 0

# 미리 계산
arr_p = []
arr_p.append(0)
arr_p.append(0)
for i in range (2, L+1) :
    arr_p.append(i)
# print(arr_p)
for i in range(2, L+1) :
    if arr_p[i] == 0 : continue

    j = i+i
    while j < L+1 :
        if j > i and arr_p[j] == 0 :
            pass
        else :
            arr_p[j] = 0
        j += i

# print(arr_p)

for i in range(2, L+1) :
    if not arr_p[i] :
        continue
    p = i
    if K % p != 0 :
        continue
    q = K // p
    # print(p,q)
    if min(p, q) < L :
        min_value = min(p, q)
        break

if min_value == 0 :
    print('GOOD')
else :
    print('BAD', min_value)