N = int(input())

arr = []
for _ in range(N*2) :
    arr.append(input())

cnt = 0
for i in range(N) :
    if arr[i] == arr[i+N] :
        cnt += 1
print(cnt)