string = input()

stringArr = string.split(" = ")

opArr = stringArr[0].split(" + ")

if int(opArr[0]) + int(opArr[1]) == int(stringArr[1]) :
    print('YES')
else :
    print('NO')