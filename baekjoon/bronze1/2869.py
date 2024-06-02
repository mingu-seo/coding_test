value = input().split()
up = int(value[0])
down = int(value[1])
goal = int(value[2])

# 시간초과
# run = 0
# day = 0
# while True :
#     day += 1
#     run += up
    
#     # print(day, run)
#     if run >= goal :
#         break
#     run -= down
    
# print(day)
# 2 1 5 -> 4
# 5에서 미끄러지는거리 1을 뺀거에 올라가/내려가는 차이로 나눔
# 근데 나머지가 있으면 하루추가
day = (goal-down) // (up-down)
if (goal-down) % (up-down) : day += 1

print(day)