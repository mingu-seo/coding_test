'''
직사각형이 되려면 x좌표도, y좌표도 같은값이 2개씩 나와야하므로
각 좌표값이 몇개씩인지 체크해서 값이 1인 키 출력
'''

xDict = {}
yDict = {}
for i in range(3):
    values = input().split()
    if xDict.get(values[0]) :
        xDict[values[0]] = xDict[values[0]] + 1
    else :
        xDict[values[0]] = 1
    if yDict.get(values[1]) :
        yDict[values[1]] = yDict[values[1]] + 1
    else :
        yDict[values[1]] = 1
# print(xDict)
# print(yDict)
for v, c in xDict.items():
    if c == 1 :
        print(v, end=' ')
for v, c in yDict.items():
    if c == 1 :
        print(v, end='')
