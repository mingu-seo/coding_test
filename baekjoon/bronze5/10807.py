size = int(input())

val = input().split(' ')
result = {}
for v in val:
    if result.get(v) :
        result[v] = result[v] + 1
    else :
        result[v] = 1
    size = size - 1
    if size == 0 : break
val2 = input()
print(result.get(val2,0))