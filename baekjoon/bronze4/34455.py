D = int(input())
N = int(input())

result = D
for _ in range(N) :
    o = input()
    Q = int(input())
    if o == '+' :
        result += Q
    else :
        result -= Q
print(result)