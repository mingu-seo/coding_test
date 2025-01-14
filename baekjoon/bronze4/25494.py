T = int(input())

arr = []
for _ in range(T) :
    a, b, c = map(int, input().split())
    r = 0
    for x in range(1, a+1) :
        for y in range(1, b+1) :
            for z in range (1, c+1) :
                if x % y == y % z and y % z == z % x and z % x == x % y :
                    r += 1
    arr.append(r)

for r in arr :
    print(r) 