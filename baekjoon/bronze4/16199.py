y1, m1, d1 = map(int, input().split())
y2, m2, d2 = map(int, input().split())

age1 = y2 - y1
if m2 == m1 and d2 < d1 :
    age1 -= 1
elif m2 < m1 :
    age1 -= 1

age2 = y2 - y1 + 1
age3 = y2 - y1

print(age1)
print(age2)
print(age3)