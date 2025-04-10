# print(chr(65))
# print(ord('A'))
value = input()
arr = []

for v in range(65, 91) :
    arr.append(chr(v))

result = ''
for v in value :
    if v in arr :
        arr.pop(arr.index(v))

if arr :
    print(arr[0])
else :
    print(0)