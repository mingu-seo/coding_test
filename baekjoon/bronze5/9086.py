size = int(input())
result = []
for i in range(size):
    value = input()
    result.append(value[0] + value[len(value)-1])
for e in result:
    print(e)