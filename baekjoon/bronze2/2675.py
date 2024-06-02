size = int(input())
result = []
for i in range(size):
    resultStr = ''
    val = input().split(' ')
    loop = int(val[0])
    string = val[1]
    for c in string:
        resultStr += c * loop
    result.append(resultStr)
for r in result:
    print(r)
