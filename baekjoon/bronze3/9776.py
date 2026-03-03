n = int(input())
result = 0
pi = 3.14159
for _ in range(n) :
    values = input().split()
    v = 0
    if values[0] == 'C' :
        v = 1/3 * pi * float(values[1])**2 * float(values[2])
    elif values[0] == 'L' :
        v = pi * float(values[1])**2 * float(values[2])
    elif values[0] == 'S' :
        v = 4/3 * pi * float(values[1])**3
    if result < v : result = v
print(round(result,3))