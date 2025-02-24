N = int(input())

total = 1
for i in range(2, N+1) :
    total = total * i
print(total // (60*60*24*7))