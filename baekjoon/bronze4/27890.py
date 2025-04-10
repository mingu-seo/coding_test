x, N = map(int, input().split())

r = x
for t in range(1, N+1) :
    if r % 2 == 0 : 
        r = r // 2 ^ 6
    else :
        r = 2*r ^ 6
print(r)