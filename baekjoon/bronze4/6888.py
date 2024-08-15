X = int(input())
Y = int(input())

for y in range(X, Y+1) :
    y2 = y - X
    if y2 % 60 == 0 :
        print('All positions change in year {}'.format(y))