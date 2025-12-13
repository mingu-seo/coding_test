A, B = map(int, input().split())
C, D = map(int, input().split())

a = A+C
b = B+D

if a < b :
    print('Hanyang Univ.')
elif b < a :
    print('Yongdap')
else :
    print('Either')
