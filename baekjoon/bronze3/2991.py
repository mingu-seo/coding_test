A, B, C, D = map(int, input().split())
P, M, N = map(int, input().split())

limit = max(A,B,C,D)

d1 = ([1]*A + [0]*B) * limit
d2 = ([1]*C + [0]*D) * limit
p_r = 0
m_r = 0
n_r = 0

if d1[P-1] == 1 : p_r += 1
if d2[P-1] == 1 : p_r += 1
if d1[M-1] == 1 : m_r += 1
if d2[M-1] == 1 : m_r += 1
if d1[N-1] == 1 : n_r += 1
if d2[N-1] == 1 : n_r += 1


print(p_r)
print(m_r)
print(n_r)