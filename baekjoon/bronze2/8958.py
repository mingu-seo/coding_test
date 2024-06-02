'''
OX퀴즈

'''

N = int(input())

result = []
for n in range(N) :
    val = input()
    total = 0
    conScore = 1
    for c in val :
        if c == 'O':
            total += conScore
            conScore += 1
        elif c == 'X' :
            conScore = 1
    result.append(total)
for r in result :
    print(r)