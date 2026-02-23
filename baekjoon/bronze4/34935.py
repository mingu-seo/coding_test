N = int(input())

numbers = list(map(int, input().split()))

prev = min(numbers)-1
run = True
for n in numbers :
    if prev == n :
        run = False
        break
    else :
        prev = n
        

if run :
    print(1)
else :
    print(0)
