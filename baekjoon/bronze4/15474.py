N, A, B, C, D = map(int, input().split())

N_A = N // A
if N % A > 0 : N_A += 1

N_C = N // C
if N % C > 0 : N_C += 1

print(min(N_A * B, N_C * D))