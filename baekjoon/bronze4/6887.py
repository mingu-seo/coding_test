import math
tiles = int(input())

while True :
    t = math.sqrt(tiles)
    if t % 1 == 0 :
        print('The largest square has side length {}.'.format(int(t)))
        break
    else :
        tiles -= 1