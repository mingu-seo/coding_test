a, b, c = list(map(int, input().split()))

if a == b or a == c or b == c or a+b == c or a+c == b or b+c == a :
    print('S')
else :
    print('N')