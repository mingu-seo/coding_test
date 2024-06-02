'''
풍선 터뜨리기


'''
N = int(input())
loc = [int(i) for i in input().split()]

result = []
i = 0
l = loc[i]
result.append(i+1)
loc[i] = 0
while True :
    
    # 인덱스 l만큼 이동
    count = 0 # 현재이동횟수
    moveCount = 0 # 최대이동횟수
    if l > 0 : # 양수
        while count <  l:
            i += 1
            if i > len(loc)-1 : 
                i=0
            if loc[i] == 0 :
                continue
            count += 1
    elif l < 0 : # 음수
        while count >  l:
            i -= 1
            if i < 0: 
                i=len(loc)-1
            if loc[i] == 0 :
                continue
            count -= 1
    result.append(i+1)

    # 반복횟수 다 돌면 중지
    if len(result) == N : break
    
    # 해당인덱스 값 0으로 바꿈 (풍선 터진 상태)
    l = loc[i]
    loc[i] = 0
    # print('index:{}'.format(i+1))

print(*result)