n, m = map(int, input().split())

# 오늘은 일요일, 날짜는 n, 저저번주 일요일은 날짜는 m
r = 0
if n - 7 > 0 :
    # 바로 계산 가능한 날짜
    r = n - 7
else :
    # 월 마지막날이 끼어있는 경우
    last = m+14-n
    r = last + (n-7)

print(r)