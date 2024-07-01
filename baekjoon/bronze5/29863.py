s = int(input())
e = int(input())
h = 0
if s > e :
    h = 24 - s + e
else :
    h = e - s
print(h)