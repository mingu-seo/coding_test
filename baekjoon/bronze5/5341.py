'''
Pyramids
'''
result = []
while True :
    n = int(input())
    if n == 0 :
        break
    total = 0
    for i in range(1, n+1) :
        total += i
    result.append(total)

for r in result :
    print(r)