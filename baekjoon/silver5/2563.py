size = int(input())

total = []
for i in range(100):
    t = [False for i in range(100)]
    total.append(t)
arr = []
for i in range(size):
    value = [int(i) for i in input().split()]
    arr.append(value)
# print( arr)

for a in arr:
    for i in range(a[0], a[0]+10):
        for j in range(a[1], a[1]+10):
            total[i][j] = True

area = 0
for rows in total:
    for row in rows:
        if row == True : area += 1
print(area)