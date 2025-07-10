N = int(input())

numbers = list(map(int, input().split()))
total = 0
continue_count = 0

for n in numbers :
    if n == 1 :
        continue_count += 1
        total += continue_count
    else :
        continue_count = 0
print(total)