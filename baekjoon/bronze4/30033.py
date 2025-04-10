N = int(input())
plan = list(map(int, input().split()))
action = list(map(int, input().split()))
result = 0

for i, v in enumerate(plan) :
    if plan[i] <= action[i] :
        result += 1

print(result)