p = int(input())
q = int(input())

white1 = 50 / 1000000
white2 = 10 / 1000000
red = 30 / 1000000

r1 = p / 1000000
r2 = q / 1000000

if r1 <= white1 and r2 <= white2 :
    print('White')
elif r2 > red :
    print('Red')
else :
    print('Yellow')