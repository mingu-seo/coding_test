A = int(input())
B = int(input())
C = B - A

if C >= 31 :
    print('You are speeding and your fine is $500.')
elif C >= 21 :
    print('You are speeding and your fine is $270.')
elif C >= 1 :
    print('You are speeding and your fine is $100.')
else :
    print('Congratulations, you are within the speed limit!')