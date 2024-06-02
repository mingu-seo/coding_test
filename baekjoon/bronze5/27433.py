'''
팩토리얼2

'''
def factorial(n) :
    if n <= 0:
        return 1
    else :
        return factorial(n-1) * n

N = int(input())

result = factorial(N)
print(result)