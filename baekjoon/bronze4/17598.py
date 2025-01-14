vote = {'Tiger':0, 'Lion':0}

for _ in range(9) :
    key = input()
    vote[key] = vote[key]+1

if vote['Tiger'] > vote['Lion'] :
    print('Tiger')
else :
    print('Lion')