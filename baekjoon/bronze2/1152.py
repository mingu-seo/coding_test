val = input()
temp = ' '
result = 0
for v in val:
    if temp == ' ' and v != ' ':
        result+=1
    temp = v
print(result)