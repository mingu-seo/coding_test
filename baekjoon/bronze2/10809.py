val = input()
result = [-1 for i in range(26)]
for i,v in enumerate(val):
    if result[ord(v)-97] == -1:
        result[ord(v)-97] = i
for r in result :
    print(r, end=' ')