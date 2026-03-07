N = int(input())
result = 0
minute = 0

result_temp = 0

for _ in range(N) :
    T, M = map(int, input().split())
    
    if M == 0:
        result_temp += T - minute
        minute = T
        continue
    else :
        result_temp += T - minute
        minute = T
        if result_temp > result :
            result = result_temp
        result_temp = 0
print(max(result, result_temp))