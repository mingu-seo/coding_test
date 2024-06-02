'''
럭비 클럽

'''

result = []

while True :
    line = input()
    if line == '# 0 0':
        break
    value = line.split()
    text = ''
    if int(value[1]) > 17 or int(value[2]) >= 80 :
        text = 'Senior'
    else :
        text = 'Junior'
    result.append(value[0] + ' ' + text)

for r in result :
    print(r)