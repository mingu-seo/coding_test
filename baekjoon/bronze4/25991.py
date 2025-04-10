n = int(input())
arr = list(map(float, input().split()))

t = 0
for a in arr :
    t += a ** 3
#print(t)

r = t ** (1/3)
print(r)