arr = []

while True :
    try :
        s = input()
        s = s.replace('i','!').replace('e','@').replace('I','#').replace('E','$')
        s = s.replace('!','e').replace('@','i').replace('#','E').replace('$','I')
        arr.append(s)
    except :
        break

for a in arr :
    print(a)