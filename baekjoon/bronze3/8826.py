Z = int(input())
result = []

for _ in range(Z) :
    n = int(input())
    direction = input()

    distance = [0,0]
    for d in direction :
        if d == 'E' :
            distance[0] += 1
        elif d == 'N' :
            distance[1] += 1
        elif d == 'W' :
            distance[0] -= 1
        elif d == 'S' :
            distance[1] -= 1
    
    result.append(abs(distance[0]) + abs(distance[1]))
# print(result)
for r in result :
    print(r)
