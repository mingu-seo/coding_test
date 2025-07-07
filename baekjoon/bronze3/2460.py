
maxPerson = 0
curPerson = 0
for _ in range(10) :
    d, u = map(int, input().split())
    curPerson -= d
    curPerson += u
    if maxPerson < curPerson : maxPerson = curPerson
print(maxPerson)