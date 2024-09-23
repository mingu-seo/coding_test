A = int(input()) # 원래 고기 온도
B = int(input()) # 목표 온도
C = int(input()) # 얼어있는 고기를 1도 올리는데 걸리는 시간
D = int(input()) # 얼어있는 고기를 해동하는데 걸리는 시간
E = int(input()) # 얼어있지 않은 고기를 1도 올리는데 걸리는 시간

total = 0
if A < 0 :
    total = -A * C
    total += D
else : # 고기온도가 영상이면 목표온도와의 차이만큼만 올리면 되므로
    B = B - A

total += B * E
print(total)