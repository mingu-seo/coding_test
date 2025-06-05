X = int(input())

A = 3
B = 2
result = 0
for i in range(X) :
    if i % 2 == 0 :
        result += A
    else :
        result -= B
print(result)