'''
Who is in the middle?
'''

numbers = []
for _ in range(3) :
    numbers.append(int(input()))

numbers = sorted(numbers)
print(numbers[1])