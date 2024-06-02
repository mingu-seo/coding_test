value = input().split()
N = int(value[0])
M = int(value[1])

matrix1 = []
matrix2 = []

for i in range(N*2):
    row = [int(r) for r in input().split()]
    if i <= N-1:
        matrix1.append(row)
    elif i <= N*2-1:
        matrix2.append(row)
# print(matrix1)
# print(matrix2)

result = []
for i in range(N):
    row = []
    for j in range(M):
        print(matrix1[i][j] + matrix2[i][j], end=' ')
    print()
