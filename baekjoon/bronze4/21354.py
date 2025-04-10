A, P = map(int, input().split())

A = A * 7
P = P * 13

if A == P :
    print('lika')
elif A > P :
    print('Axel')
else :
    print('Petra')