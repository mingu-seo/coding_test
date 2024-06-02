'''
피보나치 5

'''
def fibonacci(n) :
    if n <= 1:
        return n
    else :
        return fibonacci(n-1) + fibonacci(n-2)

N = int(input())

result = fibonacci(N)
print(result)