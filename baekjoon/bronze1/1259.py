'''
팰린드롬수
'''

result = []
while True :
    value = input()
    if value == '0' : break
    value2 = ''
    for c in value :
        value2 = c + value2
    # print(value, value2)
    if value == value2 :
        result.append('yes')
    else :
        result.append('no')
    

for r in result :
    print(r)