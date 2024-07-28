N = int(input())

for i in range(1, N+1) :
    if i % 6 == 0 or i == N:
        print(str(i)+ ' Go!', end= ' ')
    else :
        print(i, end=' ')