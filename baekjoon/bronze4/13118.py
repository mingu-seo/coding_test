mans = list(map(int, input().split()))
apples = list(map(int, input().split()))

man = 0
for a in apples :
    if a in mans :
        man = mans.index(a) + 1
        break
print(man)