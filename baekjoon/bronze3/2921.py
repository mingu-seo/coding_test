import itertools
N = int(input())
arr = []
for i in range(N+1) :
    arr.append(i)
result = list(itertools.product(arr, arr))

# print(result)

equalSum = 0
nonEqualSum = 0
for i,j in result :
    if i == j :
        equalSum += (i+j)
    else :
        nonEqualSum += (i+j) / 2
print(int(equalSum + nonEqualSum))