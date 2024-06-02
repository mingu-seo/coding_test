'''
gcd 재귀 함수로 최소공약수 구하기
최소공배수 = x * y / 최소공약수
'''
def gcd(x,y) :
    if y == 0 : return x
    return gcd(y, x%y)

x, y = (int(i) for i in input().split())
r = gcd(x,y)

print(x * y // r)