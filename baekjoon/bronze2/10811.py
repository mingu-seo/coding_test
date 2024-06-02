val = input().split(' ')
arr = [i for i in range(1, int(val[0])+1)]

for i in range(int(val[1])):
    row = input().split(' ')
    start = int(row[0])
    end = int(row[1])

    temp = []
    for i in range(start-1, end):
        temp.append(arr[i])
    temp.reverse()
    for i,j in enumerate(range(start-1, end)):
        arr[j] = temp[i]
    # print(arr)
for e in arr:
    print(e, end=' ')