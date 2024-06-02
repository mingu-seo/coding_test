val = input()
strCount = {}

for c in val:
    if strCount.get(c.upper()) :
        strCount[c.upper()] = strCount[c.upper()]+1
    else :
        strCount[c.upper()] = 1
maxKey = ''
maxValue = 0
dup = 0
for k,v in strCount.items():
    if v == maxValue : dup = 1
    
    if v > maxValue :
        maxKey = k
        maxValue = v
        dup = 0
if dup == 1 : print('?')
else :print(maxKey)