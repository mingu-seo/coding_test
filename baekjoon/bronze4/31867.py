N = int(input())
value = input()

odd_count = 0
even_count = 0

for c in value :
    if int(c) % 2 == 0 :
        even_count += 1
    else :
        odd_count += 1

if even_count > odd_count :
    print(0)
elif even_count < odd_count :
    print(1)
else :
    print(-1)