arr = []

while True :
    value = input()
    if value == 'end' : break
    arr.append(value)

for a in arr :
    if a == 'animal' :
        print('Panthera tigris')
    elif a == 'tree' :
        print('Pinus densiflora')
    elif a == 'flower' :
        print('Forsythia koreana')
