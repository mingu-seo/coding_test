'''
운동

N : 분
m : 초기맥박
M : 최대맥박
T : 1분당 증가맥박
R : 휴식시 감소맥박
'''
N, m , M, T, R = tuple(map(int, input().split()))

minute = 0 # 소요시간(분)
train_m = 0 # 운동시간(분)
cur_m = m # 현재맥박
while train_m < N :
    if cur_m+T <= M : # 최대맥박보다 작거나 같으면
        cur_m = cur_m+T # 맥박증가
        train_m += 1 # 운동시간+1
    else :
        if minute == 0:
            minute = -1
            break
        if cur_m-R < m : # 맥박감소값이 m보다 작으면 m으로
            cur_m = m
        else :
            cur_m = cur_m-R # 맥박감소
    minute += 1
        
    
    # print(minute, cur_m, train_m)
    
print(minute)