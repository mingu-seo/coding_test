s = input()

value = {'M':1, 'O':1, 'B':1, 'I':1, 'S':1}

for c in s :
    if value.get(c) :
        value[c] = 0

result = True
for k in value.keys() :
    if value.get(k) == 1 :
        result = False
        break
print('YES' if result else 'NO')
