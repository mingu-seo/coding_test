N = int(input())
numbers = map(int, input().split())

odd_count = 0
even_count = 0

for n in numbers :
    if n % 2 == 0 :
        even_count += 1
    else :
        odd_count += 1

if even_count > odd_count :
    print('Happy')
else :
    print('Sad')