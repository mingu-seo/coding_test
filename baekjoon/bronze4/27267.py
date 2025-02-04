a, b, c, d = map(int, input().split())

ab = a * b
cd = c * d

if ab > cd :
    print('M')
elif ab < cd :
    print('P')
else :
    print('E')