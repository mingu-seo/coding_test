# 1 ~ a : Outside
# a < and < b : City
# b ~ n : Outside

n, a, b = map(int ,input().split())
s, t = map(int, input().split())

# 시작과 도착 모두 도시안에 있으면
if s >= a+1 and s <= b-1 and t >= a+1 and t <= b-1 :
    print('City')
elif s <= n and t <= n : # 시작, 도착 모두 지역에 있으면
    if ((s >= 1 and s <= a) and (t >= 1 and t <= a)) or ((s >= b and s <= n) and (t >= b and t <= n)): # 둘 중 하나라도 도시안에 있으면
        print('Outside')
    else :
        print('Full')
else :
    print('Full')