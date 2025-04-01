picture = []
for _ in range(15) :
    line = input().split()
    picture.append(line)

# print(picture)
for p in picture :
    if 'w' in p :
        print('chunbae')
        break
    elif 'b' in p :
        print('nabi')
        break
    elif 'g' in p :
        print('yeongcheol')
        break
