r = int(input())
rules = []
for _ in range(r) :
    rules.append(input())

n = int(input())
result = []
for _ in range(n) :
    i = int(input())
    if i > 0 and i <= 50 and i-1 < len(rules) :
        result.append('Rule {}: {}'.format(i, rules[i-1]))
    else :
        result.append('Rule {}: No such rule'.format(i))
    

for r in result :
    print(r)