values = [int(i) for i in input().split()]

for x in range(-999, 1000):
    for y in range(-999, 1000):
        if x*values[0] + y*values[1] == values[2] and x*values[3] + y*values[4] == values[5] :
            print(x, y)