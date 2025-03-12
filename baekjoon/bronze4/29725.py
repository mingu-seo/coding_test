score = {'P':1, 'p':-1, 'N':3, 'n':-3, 'B':3, 'b':-3, 'R':5, 'r':-5, 'Q':9, 'q':-9}
result = 0

for _ in range(8) :
    line = input()
    for c in line :
        if score.get(c) :
            # print(c, score.get(c), result)
            result += score.get(c)
print(result)