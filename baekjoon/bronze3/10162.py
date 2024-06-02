'''
전자레인지

A : 5분(300초)
B : 1분(60초)
C : 10초
'''

A = 300
B = 60
C = 10

T = int(input())

if (T % C != 0) :
    print(-1)
else :
    v1 = T // A
    v2 = T % A // B
    v3 = T % B // C
    print(v1, v2, v3)