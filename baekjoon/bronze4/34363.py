S = int(input())
D = float(input())
T = float(input())

# 초속 피트
s = S * 5280 / (60*60)

if s * T > D :
    print('MADE IT')
else :
    print('FAILED TEST')