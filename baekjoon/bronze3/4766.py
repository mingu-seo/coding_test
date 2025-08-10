result = []

v = float(input())
while True :
    i = float(input())
    if i == 999 : break
    t = i - v
    result.append('{:.2f}'.format(t))
    v = i

for r in result :
    print(r)