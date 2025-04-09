T = int(input())

result = []
for _ in range(T) :
    n = int(input())
    r = '++++ ' * (n//5)
    if n % 5 > 0 : r += '|'*(n%5)
    result.append(r)

for r in result :
    print(r)