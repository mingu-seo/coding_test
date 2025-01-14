k = int(input())

r = 25 + k * 0.01
if r < 100 : r = 100
if r > 2000 : r = 2000
print('%.2f' % r)