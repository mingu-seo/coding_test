D, H, M = tuple(map(int, input().split()))

# 초기값
minute = 0

# 분계산
if M < 11 :
    H -= 1
    minute = 60 + (M - 11)
else :
    minute = M - 11
# print(minute)

# 시간 계산
if H < 11 :
    D -= 1
    H += 24
H = H - 11
minute += H * 60
# print(minute)

# 일자 계산
D = D - 11
minute += D * 24 * 60

if minute < 0 : 
    print(-1)
else :
    print(minute)