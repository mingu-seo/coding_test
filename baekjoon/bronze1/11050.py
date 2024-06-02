'''
이항 계수 1

이항계수 : 주어진 크기 집합에서 원하는 개수만큼 순서없이 뽑는 조합의 가짓수

nCk = n! / (n-k)!*k!
'''

value = [int(i) for i in input().split()]
def factorial(n) :
    if n <= 1:
        return 1
    return factorial(n-1) * n

print(factorial(value[0]) // (factorial(value[0]-value[1])*factorial(value[1])))