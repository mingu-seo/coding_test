size = int(input())
valList = []
for i in range(size):
    valList.append(input().split(' '))
    
for i, val in enumerate(valList): 
    print('Case #{}: {} + {} = {}'.format(i+1, val[0], val[1], (int(val[0]) + int(val[1]))))