# v = '2023-10-20'
v = input()

vArr = v.split('-')

import datetime

v2 = datetime.datetime(int(vArr[0]), int(vArr[1]), int(vArr[2]),0,0,0)

s_date = datetime.datetime(2023, 10, 21,0,0,0)
term = s_date - v2
# print(term.days)

if term.days >= 35 :
    print('GOOD')
else :
    print('TOO LATE')
