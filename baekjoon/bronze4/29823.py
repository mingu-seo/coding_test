N = int(input())
line = input()

direct = {'N':1,'S':-1,'E':1,'W':-1}

updown = 0
leftright = 0

for c in line :
    if c == 'N' or c == 'S' :
        updown += direct.get(c)
    elif c == 'E' or c == 'W' :
        leftright += direct.get(c)

result = abs(updown) + abs(leftright)
print(result)