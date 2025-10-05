h = int(input())
M = int(input())

result = 0
for t in range(1, M+1) :
    A = -6 * t**4 + h * t**3 + 2 * t**2 + t
    # print(t, A)
    if A <= 0 :
        result = t
        break
if result == 0 :
    print('The balloon does not touch ground in the given time.')
else :
    print('The balloon first touches ground at hour: {}'.format(result))