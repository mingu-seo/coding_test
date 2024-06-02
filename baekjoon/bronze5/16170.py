import datetime
d = datetime.datetime.now()
print(d.year)
print('0' + str(d.month) if d.month < 10 else d.month)
print('0' + str(d.day) if d.day < 10 else d.day)