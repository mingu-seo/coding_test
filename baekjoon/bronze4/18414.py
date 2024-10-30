x, l, r = list(map(int, input().split()))

minValue = max(x, l, r)
minIdx = 0

for i in range(l, r+1) :
    if minValue > abs(x-i) :
        minValue = abs(x-i)
        minIdx = i
print(minIdx)