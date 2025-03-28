total = 0
arr = []
for _ in range(10) :
    v = int(input())
    arr.append(v)
    total += v

result = 0
for a in arr :
    if total - a == a :
        result = a
        break
print(result)