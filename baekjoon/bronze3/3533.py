n = list(map(int, input().split()))

result = []
s = 0
# 두개짜리 | 연산
for i in range(s, len(n)) :
    for j in range(i+1, len(n)) :
        # print(n[i], n[j], n[i] | n[j])
        result.append(n[i] | n[j])
# 세개짜리 연산
for i in range(s, len(n)) :
    for j in range(i+1, len(n)) :
        for k in range(j+1, len(n)) :
            result.append(n[i] | n[j] | n[k])

answer = 0
for i, r in enumerate(result) :
    if i == 0 : answer = r
    if i > 0 :
        answer = answer ^ r
print(answer)