'''
검증수
'''

numbers = list(map(int, input().split()))

total = 0
for n in numbers : 
    total += n ** 2
print(total % 10)