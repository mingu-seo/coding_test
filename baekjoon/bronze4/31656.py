value = input()

result = ''
prev_str = ''

for v in value :
    if prev_str != v :
        prev_str = v
        result += v
print(result)