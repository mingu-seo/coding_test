'''
한변 점의 개수 : 2 -> 3 -> 5 -> 9 -> 17

0 : 2
1 : 3
2 : 5
3 : 9
4 : 17
5 : 33
'''
value = int(input())
pointCount = 2
for i in range(1, value+1):
    pointCount = pointCount + (pointCount-1)
    # print(pointCount)

print(pointCount * pointCount)