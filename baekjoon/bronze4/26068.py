N = int(input())
c = 0

for _ in range(N) :
    row = input()
    if int(row[2:]) <= 90 :
        c += 1
print(c)