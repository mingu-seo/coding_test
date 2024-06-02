'''
0,0 -> 0,1 -> 1,0 -> 2,0 -> 1,1 -> 0,2 -> 0,3 -> 1,2 ->

0,+1(오) -> +1,-1(왼아)... -> +1,0(아) -> -1,+1(오위)... 
'''
direct = [[0,1], [1,-1], [1,0], [-1,1]]
# 방향 = [오른, 왼아래, 아래, 오른위]

value = int(input())

# 이 방법은 시간초과 발생
# xy = [0,0]

# i = 0
# while True :
#     value -= 1
#     # print(xy)
#     if value == 0 : break

#     xy[0] += direct[i][0]
#     xy[1] += direct[i][1]

#     if i == 1 :
#         if xy[1] == 0 :
#             i += 1
            
#     elif i == 3 :
#         if xy[0] == 0 :
#             i += 1
#     else :
#         i += 1
    
#     if i > 3 : i=0


# print('{}/{}'.format(xy[0]+1,xy[1]+1))

count = 1 # 대각선 칸수 (짝수일때 왼아래쪽으로)
total = 0 # 합계 (이전 대각선까지의 합계)

while True :
    if value <= count+total :
        # 대각선 수가 홀수번째 이면
        if count % 2 == 1 :
            # 대각선칸개수-(입력값-직전대각선칸개수-1) / 입력값-직전대각선칸개수
            print('{}/{}'.format(count - (value - total - 1),value - total))
            break
        else : # 짝수번째 이면 반대로
            print('{}/{}'.format(value - total, count - (value - total - 1)))
            break
    else :
        total += count
        count += 1