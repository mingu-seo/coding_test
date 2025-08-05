arr = []

for _ in range(3):
    arr.append(sum(list(map(int, input().split()))))

for a in arr :
    if a == 3 :
        print('A')
    elif a == 2 :
        print('B')
    elif a == 1 :
        print('C')
    elif a == 0 :
        print('D')
    elif a == 4 :
        print('E')


