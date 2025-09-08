# 짝수의 합이 홀수의 합보다 크면 "EVEN", 그 반대이면 "ODD", 두 합이 같으면 "TIE"
k = int(input())

result = []
for _ in range(k) :
    values = list(map(int, input().split()))
    evenSum = 0
    oddSum = 0
    for v in values[1:] :
        if v % 2 == 0 :
            evenSum += v
        else :
            oddSum += v
    if evenSum > oddSum :
        result.append('EVEN')
    elif evenSum < oddSum :
        result.append('ODD')
    else :
        result.append('TIE')

for r in result :
    print(r)