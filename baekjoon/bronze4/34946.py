A, B, C, D = map(int, input().split())

bus = A + B
walk = C

if bus <= D and walk <= D :
    print('~.~')
elif bus <= D :
    print('Shuttle')
elif walk <= D :
    print('Walk')
else :
    print('T.T')