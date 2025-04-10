s = input()

i = 0
result = ''
while i < len(s) :

    if i > len(s) :
        result += s[len(s)-1]
        break
    else :
        result += s[i]

        i += ord(s[i])-64
print(result)