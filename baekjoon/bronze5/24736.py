t1 = tuple(map(int, input().split()))
t2 = tuple(map(int, input().split()))

r1 = t1[0] * 6 + t1[1] * 3 + t1[2] * 2 + t1[3] * 1 + t1[4] * 2
r2 = t2[0] * 6 + t2[1] * 3 + t2[2] * 2 + t2[3] * 1 + t2[4] * 2

print(r1, r2)
