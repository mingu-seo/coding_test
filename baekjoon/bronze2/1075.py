'''
나누기

'''
N = int(input())
F = int(input())

N = N - N % 100

result = ''
while True :
    if N % F == 0 :
        result = str(N)[-2:]
        break
    N += 1
print(result)