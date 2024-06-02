'''
기약분수 = 분모, 분자의 최대공약수
'''
def gcd(x,y) :
    if y == 0 : return x
    return gcd(y, x%y)

v1 = [int(i) for i in input().split()]
v2 = [int(i) for i in input().split()]

s1 = v1[0] * v2[1] + v2[0] * v1[1]
s2 = v1[1] * v2[1]

g = gcd(s1, s2)
print(s1//g, end=' ')
print(s2//g)