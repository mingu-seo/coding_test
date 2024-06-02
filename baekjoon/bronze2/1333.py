'''
부재중 전화

끝나는 부분은 포함안된고 어디부터 어디전까지 0~4
'''
N, L, D = tuple(map(int, input().split()))

total = L * N + (N-1)*5 # 총앨범의 길이(노래+중간)
times = [] # 초별 통화가능여부

countL = 0 # 노래재생중
breakTime = 0
for i in range(total) :
    if countL < L :
        countL += 1
        times.append(False)
    else :
        if breakTime < 5 :
            times.append(True)
            breakTime += 1
        else :
            countL = 0
            breakTime = 0

callTime = 0
for i in range(0, len(times), D) :
    # print(i)
    if times[i] :
        callTime = i
        break

if callTime == 0 : # 앨범이 다 끝나도 통화를 못하는 경우
    # D의 배수인 경우 +1 안해야 함
    divTime = total // D
    if total % D : divTime += 1
    print(divTime * D) # 전체길이 나누기 통화울린초 + 1 값에 통화울린초 == 전체길이이후 통화울린초간격을 구함
else :
    print(callTime)