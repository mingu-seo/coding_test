r1 = int(input())
r2 = int(input())
r3 = int(input())

rArr = [r1,r2,r3]

def check(rArr) : 
    road = [[1,3], [6,8], [2,5]]
    result = 'JAH'
    for i, r in enumerate(road) :
        if rArr[i] not in r :
            result = 'EI'
            break
    return result

result = check(rArr)

print(result)