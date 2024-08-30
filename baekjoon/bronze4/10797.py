n = int(input())
values = list(map(int, input().split()))

cnt = 0
for v in values :
    if v == n :
        cnt += 1
print(cnt)