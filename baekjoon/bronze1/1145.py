'''
적어도 대부분의 수
'''

numbers = list(map(int, input().split()))

min_number = min(numbers)

# print(numbers)
while True :
    cnt = 0
    for n in numbers :
        # print(min_number, n)
        if min_number % n == 0 : cnt+=1
        if cnt == 3 :
            break
    if cnt == 3: break
    min_number += 1
print(min_number)