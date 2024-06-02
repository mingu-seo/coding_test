matrix = []
for i in range(5):
    value = input()
    matrix.append(value)

result = ''
for j in range(15):
    for i in range(len(matrix)):
        try :
            # print(matrix[i][j])
            result += matrix[i][j]
        except : pass
print(result)