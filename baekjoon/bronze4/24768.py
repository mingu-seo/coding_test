from sys import stdin
result = []
while True :
    x, y = map(int, stdin.readline().split())
    if x==0 and y==0 :
        break
    elif x+y == 13 :
        result.append('Never speak again.')
    elif x > y :
        result.append('To the convention.')
    elif x < y :
        result.append('Left beehind.')
    elif x == y :
        result.append('Undecided.')

for r in result :
    print(r)