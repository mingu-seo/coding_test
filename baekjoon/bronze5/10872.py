'''
팩토리얼

'''
N = int(input())

result = 1

while True :
    if N <= 1 : break
    result = result * N
    N -= 1
    
print(result)