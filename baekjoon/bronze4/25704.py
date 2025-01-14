N = int(input())
P = int(input())

r1 = 0
r2 = 0
r3 = 0
r4 = 0
if N >= 5 :
    r1 = 500
if N >= 10 :
    r2 = P * 0.1
if N >= 15:
    r3 = 2000
if N >= 20 :
    r4 = P * 0.25
r = max(r1, r2, r3, r4)
P = P - r
if P < 0 : P = 0
print(int(P))