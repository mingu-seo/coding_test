totalPrice = int(input())
totalCount = int(input())

total = 0
for i in range(totalCount):
    str = input().split(' ')
    price = int(str[0])
    count = int(str[1])
    total += price * count
if totalPrice == total : print('Yes') 
else : print('No')