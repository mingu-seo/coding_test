N = int(input())
result = 0
for _ in range(N) :
    v = input()
    if v[0] == 'C' : 
        result += 1
print(result)