numbers = set()

for i in range(2, 10) :
    numbers.add(i)
    for j in range (1, 10) :
        numbers.add(j)
        numbers.add(i*j)

N = int(input())

if N in numbers :
    print(1)
else :
    print(0)