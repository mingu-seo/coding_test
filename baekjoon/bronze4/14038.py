winCount = 0

for _ in range(6) :
    if 'W' == input() :
        winCount += 1

if winCount >= 5 :
    print(1)
elif winCount >= 3 :
    print(2)
elif winCount >= 1 :
    print(3)
else :
    print(-1)