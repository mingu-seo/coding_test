'''
대소문자 바꾸기
'''
value = input()
result = ''
for v in value :
    if ord(v) <= 90 :
        result += v.lower()
    else :
        result += v.upper()

print(result)