'''
더하기 사이클
'''
N = input()
if len(N) < 2 : N = '0'+N
orgN = N
cnt = 0
while True :
    calN = str(int(N[0]) + int(N[1]))
    if len(calN) < 2 : calN = '0'+calN
    newN = N[1] + calN[1]
    # print(newN)
    cnt += 1
    if orgN == newN : break
    else : N = newN
    
print(cnt)