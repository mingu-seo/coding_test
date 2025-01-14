t1, m1, t2, m2 = map(int, input().split())

h = 0
m = 0

if t2 >= t1 :
    h = t2 - t1
elif t1 > t2:
    h = (24-t1)+t2


if m2 >= m1 :
    m = m2 - m1    
else :
    m = (60-m1)+m2
    if h == 0 : h += 23 # 시간은 같지만 분 중 뒤에꺼가 더 작으면 23시간 더하기
    else : h -= 1

total = h*60 + m
print(total, total // 30)