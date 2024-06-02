value = int(input())

if value > 1 :
    i = 2
    v = value
    while True:
        if v % i > 0 :
            i += 1
        elif v % i == 0:
            v = v // i
            print(i)
        if v == 1 :
            break