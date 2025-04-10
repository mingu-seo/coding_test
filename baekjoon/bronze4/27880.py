t = 0
for _ in range(4) :
    line = input().split()
    if line[0] == 'Es' :
        t += int(line[1]) * 21
    elif line[0] == 'Stair' : 
        t += int(line[1]) * 17
print(t)
