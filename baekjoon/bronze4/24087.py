S = int(input())
A = int(input())
B = int(input())

s2 = S - A # 차이
a2 = s2 // B # 차이보다 큰 최소값 구하기
if s2 > 0 :
    if s2 % B > 0 : a2 += 1
else :
    a2 = 0

result = 250 + a2 * 100
print(result)