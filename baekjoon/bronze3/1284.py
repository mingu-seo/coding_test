'''
집 주소

'''

result = []
while True :
    value = input()
    if value == '0' : break
    # print(value, len(value)-1, value.count('1'), value.count('0')*3)
    result.append(len(value)-1 + value.count('1')*-1 + value.count('0') + len(value)*3 + 2)
    

for r in result :
    print(r)