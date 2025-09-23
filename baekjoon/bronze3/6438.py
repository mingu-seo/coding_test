n = int(input())

result = []
for _ in range(n) :
    line = input()
    value = ''
    for i in range(len(line)-1, -1, -1) :
        value = value + line[i]
    result.append(value)

for r in result :
    print(r)