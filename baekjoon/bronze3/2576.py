odd_sum = 0
odd_min = 0

for i in  range(7) :
    n = int(input())
    if n % 2 == 1 : 
        odd_sum += n
        if odd_min == 0 or n < odd_min :
            odd_min = n

if odd_sum == 0 :
    print(-1)
else :
    print(odd_sum)
    print(odd_min)
