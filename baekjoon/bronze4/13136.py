R, C, N = list(map(int, input().split()))

R2 = R // N
if R % N > 0 : R2 += 1
C2 = C // N
if C % N > 0 : C2 += 1

print(R2 * C2)