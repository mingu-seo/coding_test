n = int(input())

result = []
for _ in range(n) :
    price = input()
    result.append(len(price))

for r in result :
    print(r)