n = int(input())

result = 'True'

for _ in range(n) :
    v = int(input())
    if result == 'True' and v < 48 :
        result = 'False'
    
print(result)