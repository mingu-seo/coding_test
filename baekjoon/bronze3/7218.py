values = ['I','II', 'III','IV','V','VI','VII','VIII','IX','X','XI','XII']
result = set()

# print(values.index('X')+1)
N = int(input())
S = input()

for i in range(N) :
    # print(i, S[i], end=':')
    v = ''
    for j in range(i, N) :
        v += S[j]
        idx = values.index(v) if v in values else -1
        if idx >= 0 : result.add(idx+1)
result = sorted(result)
# print(result)
for r in result :
    print(r, end = ' ')