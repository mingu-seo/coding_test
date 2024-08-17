import sys
sys.setrecursionlimit(30000)

n = int(input())

def factorial(n) :
    if n <= 1 :
        return 1
    return n * factorial(n-1)

v = factorial(n)
print(v % 10)