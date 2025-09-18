n = int(input())
A = 0
B = 0

for _ in range(n) :
    a, b = map(int, input().split())

    if a > b : A += a+b
    elif a < b : B += a+b
    else : 
        A += a
        B += b
print(A, B)