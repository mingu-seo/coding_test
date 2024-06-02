N = int(input())

xy = []
for i in range(N):
    values = input().split()
    arr = [int(values[0]), int(values[1])]
    xy.append(arr)
# print(xy)
if N < 2 : print(0)
else :
    minX = min([e[0] for e in xy])
    maxX = max([e[0] for e in xy])
    minY = min([e[1] for e in xy])
    maxY = max([e[1] for e in xy])
    print((maxX-minX) * (maxY-minY))