N = int(input())

parent = 0

if N >= 1000000 :
    parent = int(N * 0.2)
elif N >= 500000 :
    parent = int(N * 0.15)
elif N >= 100000 :
    parent = int(N * 0.1)
else :
    parent = int(N * 0.05)

my = N - parent
print(parent, my)