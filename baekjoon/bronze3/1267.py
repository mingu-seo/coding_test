'''
핸드폰 요금
'''
N = int(input())
y_cost = []
m_cost = []

minutes = list(map(int, input().split()))
for minute in minutes :
    y = 0
    m = 0
    if minute < 30 :
        y = 10
        m = 15
    elif minute < 60 :
        y = (minute // 30+1) * 10
        m = 15
    else :
        y = (minute // 30+1) * 10
        m = (minute // 60+1) * 15
    
    y_cost.append(y)
    m_cost.append(m)

# print(y_cost)
# print(m_cost)
y_sum = sum(y_cost)
m_sum = sum(m_cost)

if y_sum > m_sum :
    print('M', m_sum)
elif y_sum < m_sum :
    print('Y', y_sum)
else :
    print('Y M', y_sum)