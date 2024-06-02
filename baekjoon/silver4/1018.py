'''
0:0 - W
0:1 - B
0:2 - W
...

1:0 - B
1:1 - W
1:2 - B
...

x좌표 + y좌표 == 짝수이면 W, 홀수이면 B
'''
xy = [int(i) for i in input().split()]
result = []
board = []
for x in range(xy[0]):
    row = [c for c in input()]
    board.append(row)

x_start = 0
x_end = xy[0]-8
y_start = 0
y_end = xy[1]-8

result_xy = []
for i in range(x_start, x_end+1) :
    for j in range(y_start, y_end+1) :
        result_xy.append([i,j])
# print(result_xy)
for xy in result_xy:
    # 시작색깔이 뭘로 시작하는게 더 적게 칠할지 알수없어 두가지 경우
    paintCount1 = 0
    paintCount2 = 0
    
    for x in range(xy[0], xy[0]+8):
        for y in range(xy[1], xy[1]+8):
            point = x-xy[0] + y-xy[1]
            # print(x,y)
            if (point % 2 == 0 and board[x][y] == 'B') or (point% 2 == 1 and board[x][y] == 'W'):
                # print('W:',x,y, board[x][y])
                paintCount1 += 1
            if (point% 2 == 0 and board[x][y] == 'W') or (point % 2 == 1 and board[x][y] == 'B'):
                # print('B:',x,y, board[x][y])
                paintCount2 += 1

    result.append(min(paintCount1, paintCount2))
# print(result)
print(min(result))
