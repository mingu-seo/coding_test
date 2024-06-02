arr = tuple(map(int, input().split()))

result = 'S'
for a in arr :
    if a > 1 :
        result = 'F'
        break
print(result)