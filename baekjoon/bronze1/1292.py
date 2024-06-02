'''
쉽게 푸느 문제

'''

A, B = tuple(map(int, input().split()))

numbers = []
sumNumbers = 0
n = 1
idx = 1
while True :
    for i in range(1, n+1) :
        numbers.append(n)
        if idx >= A and idx <= B :
            sumNumbers += n
        idx += 1
    n += 1
    if idx > B :
        break

# print(numbers)
print(sumNumbers)
