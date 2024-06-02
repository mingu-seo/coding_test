'''
꼬리를 무는 숫자 나열
'''
N, M = tuple(map(int, input().split()))

N1 = N // 4
if N % 4 > 0 : N1 += 1
N2 = 4 if N % 4 == 0 else N % 4

M1 = M // 4
if M % 4 > 0 : M1 += 1
M2 = 4 if M % 4 == 0 else M % 4
# print(N1, N2)
# print(M1, M2)
d1 = abs(N1 - M1)
d2 = abs(N2 - M2)

print(d1 + d2)