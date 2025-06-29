c = int(input())

result = []
case = ['','']
for i in range(c*2) :
    name = input()
    if i % 2 == 0 :
        case = ['','']
        case[1] = name
    if i % 2 == 1 :
        case[0] = name
        result.append(case)

for i,e in enumerate(result) :
    print('Case {}: {}, {}'.format(i+1, e[0], e[1]))