import sys
maxValue = -1
maxPoint = [0,0]
for i in range(9):
    value = [int(c) for c in sys.stdin.readline().split()]
    for j in range(9):
        if maxValue < value[j] :
            maxValue = value[j]
            maxPoint = [i+1, j+1]
print(maxValue)
print(maxPoint[0], maxPoint[1])

