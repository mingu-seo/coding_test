result = ['', 0]

while True :
    try :
        line = input().split()
        if result[1] > int(line[1]) :
            result[1] = int(line[1])
            result[0] = line[0]
    except :
        break

print(result[0])