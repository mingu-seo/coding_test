name = ''
cnt = 0
for _ in range(7) :
    value = input().split()
    if cnt < int(value[1]) :
        name = value[0]
        cnt = int(value[1])
print(name)