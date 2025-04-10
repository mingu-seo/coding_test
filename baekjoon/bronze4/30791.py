arr = list(map(int, input().split()))
cnt = 0
score1 = arr[0]

for i in range(1,len(arr)) :
    if score1 - arr[i] <= 1000 :
        cnt += 1
print(cnt)