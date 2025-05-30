value = input()

compareStr = 'SciComLove'
result = 0
for i, c in enumerate(value) :
    if value[i] != compareStr[i] :
        result += 1
print(result)