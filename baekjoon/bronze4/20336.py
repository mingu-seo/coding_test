n = int(input())

arr = []
for _ in range(n) :
    line = input().split()
    a = []
    for l in range(1, len(line)) :
        a.append(line[l])
    arr.append(a)
# print(arr)
import random
n = random.randint(0,n-1)

print(len(arr[n]))
for a in arr[n] :
    print(a)