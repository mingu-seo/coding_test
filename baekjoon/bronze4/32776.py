S = int(input())
Ma, F, Mb = map(int, input().split())

F_S = (Ma + F + Mb)

if S <= 240 or S <= F_S :
    print('high speed rail')
else :
    print('flight')