n = int(input())
count_0 = 0
count_1 = 0

numbers = list(map(int, input().split()))
for n in numbers :
    if n == 0 :
        count_0 += 1
    else :
        count_1 += 1
print(min(count_0, count_1))