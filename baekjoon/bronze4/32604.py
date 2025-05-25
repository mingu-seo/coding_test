n = int(input())

temp0 = 0
temp1 = 0
result = 'yes'
for _ in range(n) :
    a, b = map(int, input().split())
    if result == 'yes' :
        if temp0 <= a and temp1 <= b :
            temp0 = a
            temp1 = b
        else :
            result = 'no'
print(result)