result = []

while True :
    org = input()
    if org == '***':
        break
    new = ''
    for i in range(len(org)-1, -1, -1) :
        new += org[i]
    result.append(new)

for r in result :
    print(r)
