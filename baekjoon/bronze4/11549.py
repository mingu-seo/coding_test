T = int(input())

values = list(map(int, input().split()))

cnt = 0
for v in values :
    if v == T : cnt += 1
print(cnt)