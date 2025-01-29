N = int(input())

man = list(map(int, input().split()))

total = 0
for m in man :
    if N > m :
        total += m
    else :
        total += N
print(total)