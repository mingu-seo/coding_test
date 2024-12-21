a, b = map(int, input().split())

a2 = a - (a * (b/100))
print(a2)
if a2 > 100 :
    print(0)
else :
    print(1)
