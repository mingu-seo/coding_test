
result = []
while True :
    try :
        line = input()
        result.append(line.replace('iiing', 'th'))
    except :
        break
    
for r in result :
    print(r)