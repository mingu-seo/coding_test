t = int(input())

# R - 바위
# P - 보
# S - 가위
result = []
for _ in range(t) :
    n = int(input())
    p1_win = 0
    p2_win = 0
    for _ in range(n) :
        p1, p2 = input().split()
        if p1 == 'R' :
            if p2 == 'P' :
                p2_win += 1
            elif p2 == 'S' :
                p1_win += 1
        elif p1 == 'P' :
            if p2 == 'S' :
                p2_win += 1
            elif p2 == 'R' :
                p1_win += 1
        elif p1 == 'S' :
            if p2 == 'R' :
                p2_win += 1
            elif p2 == 'P' :
                p1_win += 1
    if p1_win > p2_win :
        result.append('Player 1')
    elif p1_win < p2_win :
        result.append('Player 2')
    else :
        result.append('TIE')

for r in result :
    print(r)
