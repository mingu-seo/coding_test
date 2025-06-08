org = 'UAPC'

value = input()
result = org
for v in value :
    if v in org :
        result = result.replace(v, '')
print(result)