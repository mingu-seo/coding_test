n = int(input())
price = {'Poblano':1500, 'Mirasol':6000, 'Serrano':15500, 'Cayenne':40000, 'Thai':75000, 'Habanero':125000}
total = 0
for _ in range(n) :
    name = input()
    total += int(price[name])
print(total)