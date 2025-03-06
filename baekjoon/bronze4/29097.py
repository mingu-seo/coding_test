n, m, k, a, b, c = map(int, input().split())

j = n*a
r = m*b
s = k*c

m = max(j, r, s)

if j == m : print('Joffrey ', end='')
if r == m : print('Robb ', end='')
if s == m : print('Stannis', end='')