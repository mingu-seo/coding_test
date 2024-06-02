'''
사분면

x,y 둘중 하나가 0이면 축에 존재
Q1 = 둘다 양수
Q2 = 음수,양수
Q3 = 둘다 음수
Q4 = 양수,음수
'''
n = int(input())
q1 = 0
q2 = 0
q3 = 0
q4 = 0
axis = 0

for i in range(n) :
    x,y = tuple(map(int, input().split()))

    if x==0 or y==0 : axis += 1

    if x > 0 and y > 0 : q1 += 1
    elif x < 0 and y > 0 : q2 += 1
    elif x < 0 and y < 0 : q3 += 1
    elif x > 0 and y < 0 : q4 += 1
print('Q1:', q1)
print('Q2:', q2)
print('Q3:', q3)
print('Q4:', q4)
print('AXIS:', axis)