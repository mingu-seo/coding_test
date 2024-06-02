values = input().split()
arr = input().split()
arr = [int(i) for i in arr]
N = int(values[0])
M = int(values[1])

arr.sort()
result = []
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            total = arr[i] + arr[j] + arr[k]
            if total <= M:
                # print(arr[i] + arr[j] + arr[k])
                result.append(total)
result.sort(reverse=True)
print(result[0])