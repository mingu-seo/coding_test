A, B, C = map(int, input().split())

if A == B and B == C :
    print('*')
elif A == B :
    print('C')
elif A == C :
    print('B')
elif B == C :
    print('A')

