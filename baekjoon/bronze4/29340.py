a = input()
b = input()

result = ''

for i, a_ in enumerate(a) :
    if a[i] > b[i] :
        result += a[i]
    else :
        result += b[i]
print(result)