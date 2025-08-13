import math
# 소수여부 판단 함수 (시간초과 발생)
# def isSosu(n) :
#     for i in range (2, int(math.sqrt(n))) :
#         if n % i == 0 :
#             return False
#     return True

# print(isSosu(9))

P, K = map(int, input().split())
min_value = 0

# 미리 계산
arr_p = []
arr_p.append(0)
arr_p.append(0)
for i in range (2, K+1) :
    arr_p.append(i)
# print(arr_p)
for i in range(2, K+1) :
    if arr_p[i] == 0 : continue

    j = i+i
    while j < K+1 :
        if j > i and arr_p[j] == 0 :
            pass
        else :
            arr_p[j] = 0
        j += i

# print(arr_p)

for i in range(2, K+1) :
    if not arr_p[i] :
        continue
    p = i
    if P % p != 0 :
        continue
    q = P // p
    # print(p,q)
    if min(p, q) < K :
        min_value = min(p, q)
        break

if min_value == 0 :
    print('GOOD')
else :
    print('BAD', min_value)