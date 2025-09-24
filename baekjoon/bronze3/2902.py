line = input()
words = line.split('-')

result = ''
for w in words :
    result += w[0]
print(result)