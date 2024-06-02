result = {}
for i in range(10):
    v = int(input())
    v = v % 42
    if result.get(v):
        result[v] = result[v] + 1
    else :
        result[v] = 0
print(len(result))