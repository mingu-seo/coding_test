N, K = map(int, input().split())

import math
def getGrade(N, g) :
    rate = math.floor(g / N * 100) / 100
    # print(g, N, rate)
    if rate <= 0.04 :
        return 1
    elif rate <= 0.11 :
        return 2
    elif rate <= 0.23 :
        return 3
    elif rate <= 0.40 :
        return 4
    elif rate <= 0.60 :
        return 5
    elif rate <= 0.77 :
        return 6
    elif rate <= 0.89 :
        return 7
    elif rate <= 0.96 :
        return 8
    else :
        return 9
    
grade = list(map(int, input().split()))
print(grade)
result = []
for g in grade :
    result.append(getGrade(N, g))

for r in result :
    print(r, end=' ')