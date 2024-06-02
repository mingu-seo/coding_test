'''
인공지능 시계

'''

h, m, s = map(int, input().split())
v = int(input())

s2 = v % 60
m2 = v // 60

s = s + s2
if s >= 60 :
    m += s // 60
    s %= 60
    
m = m + m2
if m >= 60 :
    h += m // 60
    m %= 60
    

if h >= 24 :
    h %= 24
print(h, m, s)
