# 훈련을 한 날에는 체중이 증가하면 근육량이 증가하고, 체중이 감소하거나 훈련을 하지 않은 날에는 근육량이 증가하면 근육량이 증가한다고 믿는다.
n = int(input())
isTraining = list(map(int, input().split()))

result = 0
for i in range(n) :
    x, y = map(int, input().split())
    if isTraining[i] == 1 : # 훈련을 했다면
        if x < y :
            result += y - x

print(result)
